package com.letulet.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateUtil {

	private static DateFormat DAY_FMT = new SimpleDateFormat("MM/dd/yyyy");
	private static DateFormat DAY_HOUR_FMT = new SimpleDateFormat("MM/dd/yyyy HH:00");
	
	public static String formatDay(Date date){
		return DAY_FMT.format(date);
	}
	public static String formatDayHour(Date date){
		return DAY_HOUR_FMT.format(date);
	}
    public static int getEllapsedTimeInSeconds(Date date) {
        try {
			long lastTimeUpdate = date.getTime();
			float elapsedTimeSeconds = (System.currentTimeMillis() - lastTimeUpdate) /(1000F);
			return Math.round(elapsedTimeSeconds);

        } catch (Exception e) {
			return 1;
		}
    }
    public static String getEllapsedTime(Date date) {

        int i = getEllapsedTimeInSeconds(date);

			if(i < 2)
				return String.valueOf(i) + " second";
			if(i < 60)
				return String.valueOf(i) + " seconds";
			if(i < 2*60)
				return String.valueOf(Math.round(i/60)) + " minute";
			if(i < 60*60)
				return String.valueOf(Math.round(i/60)) + " minutes";
			if(i < 3600*2)
				return String.valueOf(Math.round(i/3600)) + " hour";
			if(i < 60*24*60)
				return String.valueOf(Math.round(i/3600)) + " hours";
			if(i < 60*24*60*2)
				return String.valueOf(Math.round(i/(3600*24))) + " day";
			if(i >= 60*24*60*2)
				return String.valueOf(Math.round(i/(3600*24))) + " days";

        return String.valueOf(i);
	}

    public static boolean isYesterday(Date date)
    {
        Calendar in = new GregorianCalendar();
        in.setTime(date);
        Calendar yesterday = getRelativeCalendar(-1);
        Calendar today = getRelativeCalendar(0);
        return ((!(in.before(yesterday))) && (in.before(today)));
    }

    public static boolean isToday(Date date)
    {
        GregorianCalendar in = new GregorianCalendar();
        in.setTime(date);
        Calendar today = getRelativeCalendar(0);
        Calendar tomorrow = getRelativeCalendar(1);
        return ((!(in.before(today))) && (in.before(tomorrow)));
    }

    public static boolean isTomorrow(Date date)
    {
        GregorianCalendar in = new GregorianCalendar();
        in.setTime(date);
        Calendar tomorrow = getRelativeCalendar(1);
        Calendar dayAfter = getRelativeCalendar(2);
        return ((!(in.before(tomorrow))) && (in.before(dayAfter)));
    }

    public static boolean isFutureDay(Date date)
    {
        Calendar in = new GregorianCalendar();
        in.setTime(date);
        Calendar tomorrow = getRelativeCalendar(1);
        return (!(in.before(tomorrow)));
    }

    public static Date getRelativeDate(int offsetDays)
    {
        return getRelativeCalendar(offsetDays).getTime();
    }

    public static Calendar getRelativeCalendar(int offsetDays)
    {
        Calendar today = new GregorianCalendar();
        return getRelativeCalendar(today, offsetDays);
    }

    public static Calendar getRelativeCalendar(Calendar from, int offsetDays)
    {
        Calendar temp = new GregorianCalendar(from.get(1), from.get(2), from.get(5), 0, 0, 0);

        temp.add(5, offsetDays);
        return temp;
    }

    public static int getDayCountBetweenDates(Date d1, Date d2) {
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

    // -- OR ---

    public static int getDurationInDays(Date date1, Date date2) {

       DateTime checkInDateTime = new DateTime(date1);
       DateTime checkOutDateTime = new DateTime(date2);

       int totalNights = Days.daysBetween(new LocalDate(checkInDateTime), new LocalDate(checkOutDateTime)).getDays();
       return totalNights;

    }

    public static Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    public static Date addHours(Date date, int hours) {

        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(new Date()); // sets calendar time/date
        cal.add(Calendar.HOUR_OF_DAY, hours); // adds one hour
        return cal.getTime();

    }

    public static int getHoursBetweenDates(Date d1, Date d2) {

        long secs = (d2.getTime() - d1.getTime()) / 1000;
        return (int)secs / 3600;
    }

    // calculate the time it is NOW in the timezone provided
    public static Date getLocalNow(String timeZoneId) {

        if(timeZoneId == null) return new Date();   // return in default timezone

        DateTime localNow = DateTime.now( DateTimeZone.forID( timeZoneId ) );
        return localNow.toLocalDateTime().toDate();

    }

    public static Date getLocalDate(Date date, String timeZoneId) {

        if(timeZoneId == null){
            DateTime dateTime = new DateTime(date, DateTimeZone.forID( "UTC" ));
            return dateTime.toDate();
        }

        DateTime dateTime = new DateTime(date, DateTimeZone.forID( timeZoneId ));
        return dateTime.toDate();
    }

    //Convert 15h30 to 03:30pm
    public static String get12HourClock (int hour, int minutes) {

        String period = (hour < 12 || hour == 24) ? "am" : "pm";
        int twelveHourFormat = 0;

        if (hour == 0 || hour == 24) {
            twelveHourFormat = 12;
        } else if (hour == 12) {
            twelveHourFormat = 12;
        } else if (hour < 12) {
            twelveHourFormat = hour;
        } else if (hour > 12) {
            twelveHourFormat = hour - 12;
        }

        String _twelveHourFormat = (twelveHourFormat < 10) ? "0" + String.valueOf(twelveHourFormat) : String.valueOf(twelveHourFormat);

        if (minutes > -1) {

            if (minutes < 10) {

                _twelveHourFormat += ":0" + String.valueOf(minutes);
            } else {

                _twelveHourFormat += ":" + String.valueOf(minutes);            
            }
        }

        return _twelveHourFormat + period;
    }

    public static String getCountdown(Date from, Date to, String timeZoneId){

        Date _from = getLocalDate(from, timeZoneId);
        Date _to = getLocalDate(to, timeZoneId);

        String result = null;

        double daysCount = 0;
        double hoursCount = 0;
        double minutesCount = 0;

        double secondsInOneDay = 86400;
        double secondsInOneHour = 3600;
        double secondsInOneMinute = 60;

        double seconds = (double) (_from.getTime()-_to.getTime())/1000;

        //Get days
        double days = seconds / secondsInOneDay;

        if(days >= 1) {
            daysCount = Math.floor(days);

            seconds = seconds - (daysCount * secondsInOneDay);
        }

        //Get hours
        double hours = seconds / secondsInOneHour;
        if(hours >= 1) {
            hoursCount = Math.floor(hours);
            seconds = seconds - (hoursCount * secondsInOneHour);
        }

        //Get minutes
        double minutes = seconds / secondsInOneMinute;
        if(minutes >= 1) {
            minutesCount = Math.floor(minutes);
            seconds = seconds - (minutesCount * secondsInOneMinute);
        }

        if (daysCount >= 1) {
            return (int)daysCount + "d";
        } else if (hoursCount >= 1) {
            return (int)hoursCount + "h";
        } else {
            return (int)minutesCount + "m";
        }
    }

    public static XMLGregorianCalendar convertDateToXMLGregorianCalendar (Date date) {

        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(date);

            XMLGregorianCalendar xmlGrogerianCalendar =  DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            xmlGrogerianCalendar.setTimezone( DatatypeConstants.FIELD_UNDEFINED );

            return xmlGrogerianCalendar;
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        return null;
    }


    /*
    public static String displayLocalizedDatePattern(Locale locale) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        return dateFormat.toLocalizedPattern();

        //String formatted = dateFormat.format(the_date_you_want_here);

    }
    */
}
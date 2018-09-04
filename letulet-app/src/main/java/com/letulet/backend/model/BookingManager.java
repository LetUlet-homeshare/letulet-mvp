package com.letulet.backend.model;


import com.letulet.backend.db.DBUtils;
import com.letulet.utils.Log;

import java.sql.SQLException;
import java.util.Date;

public class BookingManager {

	static BookingManager instance = null;

    static {
		instance = new BookingManager();
	}

	static public BookingManager getInstance() {
		return instance;
	}

	private Booking createNewBooking() {

		try {
			Booking booking = DBUtils.getEntityManager().create(Booking.class);
			Date now = new Date();
			booking.setCreated(now);
			booking.setUID(java.util.UUID.randomUUID().toString());

			return booking;
		} catch (SQLException se) {
			Log.error(BookingManager.class, "Could not create a new booking");
			throw new RuntimeException("Could not create a new booking");
		}
	}

	public Booking createBooking(Property property, String email, Date checkin, Date checkout) {

		if(email == null || checkin == null || checkout == null) { throw new IllegalArgumentException(); }

		Date now = new Date();


		try {
			Booking booking = createNewBooking();
			booking.setCreated(now);
			booking.setProperty(property);
			booking.setGuestEmail(email);

			return booking;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Booking getBookingByConfirmationCode(String confirmationCode) {

		if(confirmationCode == null) { throw new IllegalArgumentException(); }

		Booking[] l = null;

		try {
			l = DBUtils.getEntityManager().find(Booking.class, "confirmationCode = ?", confirmationCode);

			if(l == null || l.length == 0)
				return null;
			else
				return l[0];

		} catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}

}

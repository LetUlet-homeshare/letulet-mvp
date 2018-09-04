package com.letulet.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by stephan on 07/11/17.
 */
public final class Log {

    private static final Logger _log = Logger.getLogger(Log.class.getName());

    public static void warn(Class loggingClass,Object msg){
    	_log.warning("" + loggingClass + ": " + msg);
    }

    public static void error(Class loggingClass, Object msg) {

        _log.severe("" + loggingClass + ": " + msg);
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public static void error(Class loggingClass, Object msg, Throwable thrw) {
        _log.log(Level.SEVERE, "" + loggingClass + ": " + msg, thrw);
    }

   public static void debug(Class loggingClass, Object msg) {
        _log.log(Level.INFO, "" + loggingClass + ": " + msg);
    }

    public static void debug(Class loggingClass, Object msg, Throwable thrw) {
        _log.log(Level.INFO, "" + loggingClass + ": " + msg, thrw);
    }

   public static void info(Class loggingClass, Object msg) {
        _log.log(Level.INFO, "" + loggingClass + ": " + msg);
    }

    public static void info(Class loggingClass, Object msg, Throwable thrw) {
        _log.log(Level.INFO, "" + loggingClass + ": " + msg, thrw);
    }

}

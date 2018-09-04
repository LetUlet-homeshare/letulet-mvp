package com.letulet.core;

import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.letulet.utils.Log;

/**
 * Created by stephan on 07/11/17.
 */
public class Config {

	private static Map<String, Object> conf			= null;
	private static ConfigObject			configObject	= null;

	private static String				runtime_env		= "prod";
	private static String				runtime_conf	= "crosspollinate.properties";

    public final static String          PRODUCTION      = "prod";
    public final static String          STAGING         = "staging";
    public final static String          DEV             = "dev";
    public final static String          API             = "api";


    static {
		Properties props = new Properties ();
		try {
			props.load (Config.class.getClassLoader ().getResourceAsStream ("runtime.properties"));
			runtime_env = props.getProperty ("environment", "prod");
            runtime_conf = props.getProperty ("conf", "crosspollinate.properties");
        }
		catch (IOException e) {
			Log.error (Config.class, "Could not read runtime conf runtime.properties... maybe we are on production "
					+ e);
		}
		catch (Exception e) {
			Log.error (Config.class, "Could not read runtime conf runtime.properties... maybe we are on production "
					+ e);
		}
		loadProps ();
	}

	public static ConfigObject getConfigObject () {

		if (configObject == null) {
			loadProps ();
		}
		return configObject;
	}

	public static Map <String, Object> getConf () {

		if (conf == null) {
			loadProps ();
		}
		return conf;
	}

	public static Properties getAsProperties (String node) {

		if (configObject == null) {
			loadProps ();
		}
		if (configObject != null) {
			ConfigObject nodeConf = ((ConfigObject) configObject.get (node));
			if (nodeConf != null)
				return nodeConf.toProperties ();
		}
		return null;
	}

	private static void loadProps () {

		ConfigSlurper configSlurper = new ConfigSlurper (runtime_env);
		try {
			conf = new HashMap<String, Object>();
			configObject = configSlurper.parse (Config.class.getClassLoader ().getResource (runtime_conf));
			configObject.flatten (conf);
		}
		catch (Exception ex) {
			ex.printStackTrace ();
		}
	}

	public static boolean contains (String key, Object val) {

		Object v = get (key);
		if (v instanceof List) {
			return ((List) v).contains (val);
		}
		else if (v instanceof String) {
			return ((String) v).contains (val.toString ());
		}
		return false;
	}

	public static Object get (String key) {

		if (conf == null)
			return null;
		return conf.get (key);
	}

	public static String getAsString (String key) {

		Object v = get (key);
		if (v == null)
			return null;
		return v.toString ();
	}

	public static String getAsString (String key, String defaultValue) {

		Object v = get (key);
		if (v == null)
			return defaultValue;
		return v.toString ();
	}

	public static boolean getAsBoolean (String key) {

		Object v = get (key);
		if (v == null)
			return false;
		if (v instanceof Boolean) {
			return (Boolean) v;
		}
		if (v instanceof String) {
			return Boolean.getBoolean ((String) v);
		}
		return false;
	}

    public static boolean isProduction () {
        if(runtime_env != null && runtime_env.equalsIgnoreCase(PRODUCTION))
            return true;
        return false;
    }

    public static boolean isStaging () {
        if(runtime_env != null && runtime_env.equalsIgnoreCase(STAGING))
            return true;
        return false;
    }

    public static boolean isDev () {
        if(runtime_env != null && runtime_env.equalsIgnoreCase(DEV))
            return true;
        return false;
    }

    public static boolean isAPI () {
        if(runtime_env != null && runtime_env.equalsIgnoreCase(API))
            return true;
        return false;
    }


    public static int getAsInteger (String key, int defaultValue) {

		Object v = get (key);
		if (v == null)
			return defaultValue;
		if (v instanceof Number) {
			return ((Number) v).intValue ();
		}
		if (v instanceof String) {
			return Integer.parseInt ((String) v);
		}
		return defaultValue;
	}

	public static boolean hasFeature (String featurename) {

		return getAsBoolean ("features." + featurename);
	}

	public static void main (String [] args) {

		Map <String, Object> c = getConf ();

		System.out.println (c);
		System.out.println (c.get ("track.login").getClass ());

	}
}

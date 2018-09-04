package com.letulet.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by stephan on 07/11/17.
 */
public class CookieUtil {

	public static String get (Cookie[] cookies, String name) {

		if ((cookies != null) && (cookies.length > 0)) {
			for (int i = 0; i < cookies.length; i++) {
				String cookieName = cookies [i].getName ();

				if ((cookieName != null) && (cookieName.equals (name))) {
					return cookies [i].getValue ();
				}
			}
		}

		return null;
	}

	public static String get (String cookie, String tag) {

		if (cookie == null) {
			return "";
		}

		tag = tag + "=";

		if (cookie.startsWith (tag)) {
			int y = cookie.indexOf (';');

			return cookie.substring (tag.length (), y);
		}

		tag = ";" + tag;

		int x = cookie.indexOf (tag);

		if (x != -1) {
			int y = cookie.indexOf (';', x + 1);

			return cookie.substring (x + tag.length (), y);
		}

		return "";
	}

	public static String set (String cookie, String tag, String sub) {

		if (cookie == null) {
			return "";
		}

		tag = tag + "=";

		if (cookie.startsWith (tag)) {
			int y = cookie.indexOf (';');

			StringBuilder sb = new StringBuilder ();

			sb.append (tag).append (sub).append (";");
			sb.append (cookie.substring (y + 1, cookie.length ()));

			return sb.toString ();
		}

		tag = ";" + tag;

		int x = cookie.indexOf (tag);

		if (x != -1) {
			int y = cookie.indexOf (';', x + 1);

			StringBuilder sb = new StringBuilder ();

			sb.append (cookie.substring (0, x + tag.length ()));
			sb.append (sub);
			sb.append (cookie.substring (y, cookie.length ()));

			return sb.toString ();
		}

		return cookie + tag.substring (1, tag.length ()) + sub + ";";
	}

	public static Cookie getCookie (HttpServletRequest request, String name) {

		if (request == null) {
			throw new IllegalArgumentException ("CookieUtils.getCookie: request was null!");
		}

		if (name == null) {
			throw new IllegalArgumentException ("CookieUtil.getCookie: cookie name was null!");
		}

		Cookie [] cookies = request.getCookies ();

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies [i].getName ().equals (name)) {
					return cookies [i];
				}
			}
		}

		return null;
	}

	public static void retireCookie (HttpServletRequest request, HttpServletResponse response, String name) {

		Cookie cookie = getCookie (request, name);

		if (cookie != null) {
			cookie.setMaxAge (0); // should expire cookie now
			cookie.setPath ("/");
			response.addCookie (cookie);
		}
	}
}
package com.letulet.utils;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by stephan on 09/11/17.
 */
public class StringUtil {

	private static Pattern	NEW_LINE_PATTERN	= Pattern.compile ("([\\n\\r][\\s]*)");
	private static Pattern	HTTP_LINK_PATTERN	= Pattern
														.compile ("(http[s]?://)([a-zA-Z_0-9\\-\\.]+)(:[0-9]+)?(/[^ ]+)?");

	public static String format (String text) {

		StringBuffer result = new StringBuffer (text.length ());

		Matcher m = NEW_LINE_PATTERN.matcher (text);
		while (m.find ()) {
			m.appendReplacement (result, "<br/>");
		}
		m.appendTail (result);
		return result.toString ();
	}

	public static String escapeHtml (String text) {

		return org.apache.commons.lang.StringEscapeUtils.escapeHtml (text);
	}

	public static String escapeXml (String text) {

		return org.apache.commons.lang.StringEscapeUtils.escapeXml (text);
	}

	public static String add (String s, String add) {

		return add (s, add, StringPool.COMMA);
	}

	public static String add (String s, String add, String delimiter) {

		return add (s, add, delimiter, false);
	}

	public static String add (String s, String add, String delimiter, boolean allowDuplicates) {

		if ((add == null) || (delimiter == null)) {
			return null;
		}

		if (s == null) {
			s = StringPool.BLANK;
		}

		if (allowDuplicates || !contains (s, add, delimiter)) {
			if (Validator.isNull (s) || s.endsWith (delimiter)) {
				s += add + delimiter;
			}
			else {
				s += delimiter + add + delimiter;
			}
		}

		return s;
	}

	public static boolean contains (String s, String text) {

		return contains (s, text, StringPool.COMMA);
	}

	public static boolean contains (String s, String text, String delimiter) {

		if ((s == null) || (text == null) || (delimiter == null)) {
			return false;
		}

		if (!s.endsWith (delimiter)) {
			s += delimiter;
		}

		int pos = s.indexOf (delimiter + text + delimiter);

		if (pos == -1) {
			if (s.startsWith (text + delimiter)) {
				return true;
			}

			return false;
		}

		return true;
	}

	public static int count (String s, String text) {

		if ((s == null) || (text == null)) {
			return 0;
		}

		int count = 0;

		int pos = s.indexOf (text);

		while (pos != -1) {
			pos = s.indexOf (text, pos + text.length ());
			count++;
		}

		return count;
	}

	public static boolean endsWith (String s, char end) {

		return startsWith (s, (new Character (end)).toString ());
	}

	public static boolean endsWith (String s, String end) {

		if ((s == null) || (end == null)) {
			return false;
		}

		if (end.length () > s.length ()) {
			return false;
		}

		String temp = s.substring (s.length () - end.length (), s.length ());

		if (temp.equalsIgnoreCase (end)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static String extractChars (String s) {

		if (s == null) {
			return "";
		}

		char [] c = s.toCharArray ();

		StringBuilder sb = new StringBuilder ();

		for (int i = 0; i < c.length; i++) {
			if (Validator.isChar (c [i])) {
				sb.append (c [i]);
			}
		}

		return sb.toString ();
	}

	public static String extractDigits (String s) {

		if (s == null) {
			return "";
		}

		char [] c = s.toCharArray ();

		StringBuilder sb = new StringBuilder ();

		for (int i = 0; i < c.length; i++) {
			if (Validator.isDigit (c [i])) {
				sb.append (c [i]);
			}
		}

		return sb.toString ();
	}

	public static String merge (List list) {

		return merge (list, StringPool.COMMA);
	}

	public static String merge (List list, String delimiter) {

		return merge ((String []) list.toArray (new String [0]), delimiter);
	}

	public static String merge (String array[]) {

		return merge (array, StringPool.COMMA);
	}

	public static String merge (String array[], String delimiter) {

		if (array == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder ();

		for (int i = 0; i < array.length; i++) {
			sb.append (array [i].trim ());

			if ((i + 1) != array.length) {
				sb.append (delimiter);
			}
		}

		return sb.toString ();
	}

	public static String read (ClassLoader classLoader, String name) throws IOException {

		return read (classLoader.getResourceAsStream (name));
	}

	public static String read (InputStream is) throws IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader (is));

		StringBuilder sb = new StringBuilder ();
		String line = null;

		while ((line = br.readLine ()) != null) {
			sb.append (line).append ('\n');
		}

		br.close ();

		return sb.toString ().trim ();
	}

	public static String remove (String s, String remove) {

		return remove (s, remove, StringPool.COMMA);
	}

	public static String remove (String s, String remove, String delimiter) {

		if ((s == null) || (remove == null) || (delimiter == null)) {
			return null;
		}

		if (Validator.isNotNull (s) && !s.endsWith (delimiter)) {
			s += delimiter;
		}

		while (contains (s, remove, delimiter)) {
			int pos = s.indexOf (delimiter + remove + delimiter);

			if (pos == -1) {
				if (s.startsWith (remove + delimiter)) {
					s = s.substring (remove.length () + delimiter.length (), s.length ());
				}
			}
			else {
				s = s.substring (0, pos) + s.substring (pos + remove.length () + delimiter.length (), s.length ());
			}
		}

		return s;
	}

	public static String replace (String s, char oldSub, char newSub) {

		return replace (s, oldSub, new Character (newSub).toString ());
	}

	public static String replace (String s, char oldSub, String newSub) {

		if ((s == null) || (newSub == null)) {
			return null;
		}

		char [] c = s.toCharArray ();

		StringBuilder sb = new StringBuilder ();

		for (int i = 0; i < c.length; i++) {
			if (c [i] == oldSub) {
				sb.append (newSub);
			}
			else {
				sb.append (c [i]);
			}
		}

		return sb.toString ();
	}

	public static String replace (String s, String oldSub, String newSub) {

		if ((s == null) || (oldSub == null) || (newSub == null)) {
			return null;
		}

		int y = s.indexOf (oldSub);

		if (y >= 0) {
			StringBuilder sb = new StringBuilder ();

			int length = oldSub.length ();
			int x = 0;

			while (x <= y) {
				sb.append (s.substring (x, y));
				sb.append (newSub);
				x = y + length;
				y = s.indexOf (oldSub, x);
			}

			sb.append (s.substring (x));

			return sb.toString ();
		}
		else {
			return s;
		}
	}

	public static String replace (String s, String [] oldSubs, String [] newSubs) {

		if ((s == null) || (oldSubs == null) || (newSubs == null)) {
			return null;
		}

		if (oldSubs.length != newSubs.length) {
			return s;
		}

		for (int i = 0; i < oldSubs.length; i++) {
			s = replace (s, oldSubs [i], newSubs [i]);
		}

		return s;
	}

	public static String reverse (String s) {

		if (s == null) {
			return null;
		}

		char [] c = s.toCharArray ();
		char [] reverse = new char [c.length];

		for (int i = 0; i < c.length; i++) {
			reverse [i] = c [c.length - i - 1];
		}

		return new String (reverse);
	}

	public static String shorten (String s) {

		return shorten (s, 20);
	}

	public static String shorten (String s, int length) {

		return shorten (s, length, "..");
	}

	public static String shorten (String s, String suffix) {

		return shorten (s, 20, suffix);
	}

	public static String shorten (String s, int length, String suffix) {

		if (s == null || suffix == null) {
			return null;
		}

		if (s.length () > length) {
			s = s.substring (0, length) + suffix;
		}

		return s;
	}

	public static String [] split (String s) {

		return split (s, StringPool.COMMA);
	}

	public static String [] split (String s, String delimiter) {

		if (s == null || delimiter == null) {
			return new String [0];
		}

		s = s.trim ();

		if (!s.endsWith (delimiter)) {
			s += delimiter;
		}

		if (s.equals (delimiter)) {
			return new String [0];
		}

		List nodeValues = new ArrayList ();

		if (delimiter.equals ("\n") || delimiter.equals ("\r")) {
			try {
				BufferedReader br = new BufferedReader (new StringReader (s));

				String line = null;

				while ((line = br.readLine ()) != null) {
					nodeValues.add (line);
				}

				br.close ();
			}
			catch (IOException ioe) {
				ioe.printStackTrace ();
			}
		}
		else {
			int offset = 0;
			int pos = s.indexOf (delimiter, offset);

			while (pos != -1) {
				nodeValues.add (s.substring (offset, pos));

				offset = pos + delimiter.length ();
				pos = s.indexOf (delimiter, offset);
			}
		}

		return (String []) nodeValues.toArray (new String [0]);
	}

	public static boolean [] split (String s, String delimiter, boolean x) {

		String [] array = split (s, delimiter);
		boolean [] newArray = new boolean [array.length];

		for (int i = 0; i < array.length; i++) {
			boolean value = x;

			try {
				value = Boolean.valueOf (array [i]).booleanValue ();
			}
			catch (Exception e) {
			}

			newArray [i] = value;
		}

		return newArray;
	}

	public static double [] split (String s, String delimiter, double x) {

		String [] array = split (s, delimiter);
		double [] newArray = new double [array.length];

		for (int i = 0; i < array.length; i++) {
			double value = x;

			try {
				value = Double.parseDouble (array [i]);
			}
			catch (Exception e) {
			}

			newArray [i] = value;
		}

		return newArray;
	}

	public static float [] split (String s, String delimiter, float x) {

		String [] array = split (s, delimiter);
		float [] newArray = new float [array.length];

		for (int i = 0; i < array.length; i++) {
			float value = x;

			try {
				value = Float.parseFloat (array [i]);
			}
			catch (Exception e) {
			}

			newArray [i] = value;
		}

		return newArray;
	}

	public static int [] split (String s, String delimiter, int x) {

		String [] array = split (s, delimiter);
		int [] newArray = new int [array.length];

		for (int i = 0; i < array.length; i++) {
			int value = x;

			try {
				value = Integer.parseInt (array [i]);
			}
			catch (Exception e) {
			}

			newArray [i] = value;
		}

		return newArray;
	}

	public static long [] split (String s, String delimiter, long x) {

		String [] array = split (s, delimiter);
		long [] newArray = new long [array.length];

		for (int i = 0; i < array.length; i++) {
			long value = x;

			try {
				value = Long.parseLong (array [i]);
			}
			catch (Exception e) {
			}

			newArray [i] = value;
		}

		return newArray;
	}

	public static short [] split (String s, String delimiter, short x) {

		String [] array = split (s, delimiter);
		short [] newArray = new short [array.length];

		for (int i = 0; i < array.length; i++) {
			short value = x;

			try {
				value = Short.parseShort (array [i]);
			}
			catch (Exception e) {
			}

			newArray [i] = value;
		}

		return newArray;
	}

	public static final String stackTrace (Throwable t) {

		String s = null;

		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream ();
			t.printStackTrace (new PrintWriter (baos, true));
			s = baos.toString ();
		}
		catch (Exception e) {
		}

		return s;
	}

	public static boolean startsWith (String s, char begin) {

		return startsWith (s, (new Character (begin)).toString ());
	}

	public static boolean startsWith (String s, String start) {

		if ((s == null) || (start == null)) {
			return false;
		}

		if (start.length () > s.length ()) {
			return false;
		}

		String temp = s.substring (0, start.length ());

		if (temp.equalsIgnoreCase (start)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static String trimLeading (String s) {

		for (int i = 0; i < s.length (); i++) {
			if (!Character.isWhitespace (s.charAt (i))) {
				return s.substring (i, s.length ());
			}
		}

		return StringPool.BLANK;
	}

	public static String trimTrailing (String s) {

		for (int i = s.length () - 1; i >= 0; i--) {
			if (!Character.isWhitespace (s.charAt (i))) {
				return s.substring (0, i + 1);
			}
		}

		return StringPool.BLANK;
	}

	public static String wrap (String text) {

		return wrap (text, 80, "\n");
	}

	public static String wrap (String text, int width, String lineSeparator) {

		if (text == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder ();

		try {
			BufferedReader br = new BufferedReader (new StringReader (text));

			String s = StringPool.BLANK;

			while ((s = br.readLine ()) != null) {
				if (s.length () == 0) {
					sb.append (lineSeparator);
				}
				else {
					String [] tokens = s.split (StringPool.SPACE);
					boolean firstWord = true;
					int curLineLength = 0;

					for (int i = 0; i < tokens.length; i++) {
						if (!firstWord) {
							sb.append (StringPool.SPACE);
							curLineLength++;
						}

						if (firstWord) {
							sb.append (lineSeparator);
						}

						sb.append (tokens [i]);

						curLineLength += tokens [i].length ();

						if (curLineLength >= width) {
							firstWord = true;
							curLineLength = 0;
						}
						else {
							firstWord = false;
						}
					}
				}
			}
		}
		catch (IOException ioe) {
			ioe.printStackTrace ();
		}

		return sb.toString ();
	}

	public static String firstLetterToUpperCase (String str) {

		if (str != null && str.length () > 0) {
			String [] all = split (str, StringPool.SPACE);
			StringBuilder result = new StringBuilder ();
			for (int i = 0; i < all.length; i++) {
				result.append (all [i].substring (0, 1).toUpperCase ()).append (all [i].substring (1)).append (
						StringPool.SPACE);
			}
			return (result.toString ().trim ());
		}
		return null;
	}

	public static String removeAccents (String text) {

		return convertNonAscii (text);
	}

	public static String stringToCleanUrl (String word) {

		return stringToCleanUrl (word, false);
	}

	public static String stringToCleanUrl (String word, boolean upperCaseFirstLetter) {

		word = word.trim ();

		if (word == null || word.equals ("")) {
			return "";
		}
		word = removeAccents (word);

		StringBuilder sb = new StringBuilder ();
		char [] ca = word.toCharArray ();
		if (Character.isDigit (ca [0])) {
			sb.append ('-');
		}
		if (upperCaseFirstLetter) {
			sb.append (Character.toUpperCase (ca [0]));
		}
		else {
			sb.append (Character.toLowerCase (ca [0]));
		}

		boolean wasLetter = true; // previous letter was a letter or digit
		boolean spacerAppended = false;
		for (int i = 1; i < ca.length; i++) {

			if (Character.isLetterOrDigit (ca [i])) {
				/*if (!wasLetter) {
					wasLetter = true;
					sb.append(Character.toUpperCase(ca[i]));
				} else {
					sb.append(ca[i]);
				}*/
				sb.append (ca [i]);
				spacerAppended = false;
			}
			else {
				if (!spacerAppended) {
					if (i < ca.length - 1)
						sb.append ('-');
					spacerAppended = true;
				}
				wasLetter = false;
			}
		}

		return sb.toString ();
	}
	private static final String	PLAIN_ASCII	= "AaEeIiOoUu" // grave
													+ "AaEeIiOoUuYy" // acute
													+ "AaEeIiOoUuYy" // circumflex
													+ "AaEeIiOoUuYy" // tilde
													+ "AaEeIiOoUuYy" // umlaut
													+ "Aa" // ring
													+ "Cc" // cedilla
											;

	private static final String	UNICODE		= "\u00C0\u00E0\u00C8\u00E8\u00CC\u00EC\u00D2\u00F2\u00D9\u00F9"
													+ "\u00C1\u00E1\u00C9\u00E9\u00CD\u00ED\u00D3\u00F3\u00DA\u00FA\u00DD\u00FD"
													+ "\u00C2\u00E2\u00CA\u00EA\u00CE\u00EE\u00D4\u00F4\u00DB\u00FB\u0176\u0177"
													+ "\u00C2\u00E2\u00CA\u00EA\u00CE\u00EE\u00D4\u00F4\u00DB\u00FB\u0176\u0177"
													+ "\u00C4\u00E4\u00CB\u00EB\u00CF\u00EF\u00D6\u00F6\u00DC\u00FC\u0178\u00FF"
													+ "\u00C5\u00E5" + "\u00C7\u00E7";

	// remove accentued from a string and replace with ascii equivalent
	public static String convertNonAscii (String s) {

		StringBuilder sb = new StringBuilder ();
		int n = s.length ();
		for (int i = 0; i < n; i++) {
			char c = s.charAt (i);
			int pos = UNICODE.indexOf (c);
			if (pos > -1) {
				sb.append (PLAIN_ASCII.charAt (pos));
			}
			else {
				sb.append (c);
			}
		}
		return sb.toString ();
	}

	//joins an array of string into a token-separated string
	public static String join (String [] arr, String token) {

		StringBuilder buffer = new StringBuilder ();
		for (String item : arr) {
			if (item != null)
				buffer.append (item).append (token);
		}
		buffer.substring (0, buffer.length () - token.length ());

		return buffer.toString ();
	}


    public static String convertStreamToString(InputStream is) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }


    public static String capitalizeFirstLetter(String original){
        if(original == null) { return ""; }
        if(original.length() == 0)
            return original;
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }


    public static String capitalizeFirstLetterOfEachWord(String str) {

        String[] words = str.split(StringPool.SPACE);
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            ret.append(Character.toUpperCase(words[i].charAt(0)));
            ret.append(words[i].substring(1));
            if(i < words.length - 1) {
                ret.append(StringPool.SPACE);
            }
        }
        return ret.toString();
    }

	public static String removeHtmlAttributes(String html) {

		if (Validator.isNull(html)) return null;

		//Replace line break
		final String LINE_BREAK = "\n";

		Whitelist wl = Whitelist.none()
				.addTags("p")
				.addTags("br")
				.addTags("h2");

		String clean = Jsoup.clean(html, wl);

		byte[] ptext = clean.getBytes(ISO_8859_1);
		String value = new String(ptext, UTF_8);

		value = value.replaceAll("<p><br></p>", "");
		value = value.replaceAll("<br></p>", "</p>");
		value = value.replaceAll("<p>", "");
		value = value.replaceAll("<h2>", "");
		value = value.replaceAll("</p>", LINE_BREAK);
		value = value.replaceAll("</h2>", LINE_BREAK);
		value = value.replaceAll("&nbsp;", " ");
		value = value.replaceAll("&amp;", "&");
		value = value.replaceAll("<br>", LINE_BREAK);

		return value;
	}
}
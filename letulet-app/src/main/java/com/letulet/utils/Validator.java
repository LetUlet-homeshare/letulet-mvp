package com.letulet.utils;

import java.util.ArrayList;


public class Validator {

	public static boolean isAddress(String address) {
		if (isNull(address)) {
			return false;
		}

		char[] c = address.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if ((!isChar(c[i])) &&
				(!isDigit(c[i])) &&
				(!Character.isWhitespace(c[i]))) {

				return false;
			}
		}

		return true;
	}

	public static boolean isChar(char c) {
		return Character.isLetter(c);
	}

	public static boolean isChar(String s) {
		if (isNull(s)) {
			return false;
		}

		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (!isChar(c[i])) {
				return false;
			}
		}

		return true;
	}

	public static boolean isDigit(char c) {
		int x = (int)c;

		if ((x >= 48) && (x <= 57)) {
			return true;
		}

		return false;
	}

	public static boolean isDigit(String s) {
		if (isNull(s)) {
			return false;
		}

		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (!isDigit(c[i])) {
				return false;
			}
		}

		return true;
	}

	public static boolean isAsciiLetterOrDigit(String s) {
		if (isNull(s)) {
			return false;
		}

		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (!(Character.isLetterOrDigit(c[i]) && c[i]<128)) {
				return false;
			}
		}

		return true;
	}
	
	public static boolean isHex(String s) {
		if (isNull(s)) {
			return false;
		}

		return true;
	}

	public static boolean isHTML(String s) {
		if (isNull(s)) {
			return false;
		}

		if (((s.indexOf("<html>") != -1) || (s.indexOf("<HTML>") != -1)) &&
			((s.indexOf("</html>") != -1) || (s.indexOf("</HTML>") != -1))) {

			return true;
		}

		return false;
	}

	public static boolean isLUHN(String number) {
		if (number == null) {
			return false;
		}

		number = StringUtil.reverse(number);

		int total = 0;

		for (int i = 0; i < number.length(); i++) {
			int x = 0;

			if (((i + 1) % 2) == 0) {
				x = Integer.parseInt(number.substring(i, i + 1)) * 2;

				if (x >= 10) {
					String s = Integer.toString(x);

					x = Integer.parseInt(s.substring(0, 1)) +
						Integer.parseInt(s.substring(1, 2));
				}
			}
			else {
				x = Integer.parseInt(number.substring(i, i + 1));
			}

			total = total + x;
		}

		if ((total % 10) == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean isEmailAddress(String ea) {
		if (isNull(ea)) {
			return false;
		}

		int eaLength = ea.length();

		if (eaLength < 6) {

			// j@j.c

			return false;
		}

		ea = ea.toLowerCase();

        int at = ea.indexOf('@');

		// Unix based email addresses cannot be longer than 24 characters.
		// However, many Windows based email addresses can be longer than 24,
		// so we will set the maximum at 48.

		//int maxEmailLength = 24;
		int maxEmailLength = 48;

        if ((at > maxEmailLength) || (at == -1) || (at == 0) ||
			((at <= eaLength) && (at > eaLength - 5))) {

			// 123456789012345678901234@joe.com
			// joe.com
			// @joe.com
			// joe@joe
			// joe@jo
			// joe@j

			return false;
		}

		int dot = ea.lastIndexOf('.');

		if ((dot == -1) || (dot < at) || (dot > eaLength - 3)) {

			// joe@joecom
			// joe.@joecom
			// joe@joe.c

			return false;
		}

		if (ea.indexOf("..") != -1) {

			// joe@joe..com

			return false;
		}

		char[] name = ea.substring(0, at).toCharArray();

		for (int i = 0; i < name.length; i++) {
			if ((!isChar(name[i])) &&
				(!isDigit(name[i])) &&
				(name[i] != '.') &&
				(name[i] != '-') &&
				(name[i] != '_')) {

				return false;
			}
		}

		if ((name[0] == '.') || (name[name.length - 1] == '.') ||
			(name[0] == '-') || (name[name.length - 1] == '-') ||
			(name[0] == '_')) { // || (name[name.length - 1] == '_')) {

			// .joe.@joe.com
			// -joe-@joe.com
			// _joe_@joe.com

			return false;
		}

        char[] host = ea.substring(at + 1, ea.length()).toCharArray();

		for (int i = 0; i < host.length; i++) {
			if ((!isChar(host[i])) &&
				(!isDigit(host[i])) &&
				(host[i] != '.') &&
				(host[i] != '-')) {

				return false;
			}
		}

		if ((host[0] == '.') || (host[host.length - 1] == '.') ||
			(host[0] == '-') || (host[host.length - 1] == '-')) {

			// joe@.joe.com.
			// joe@-joe.com-

			return false;
		}

		// postmaster@joe.com

		if (ea.startsWith("postmaster@")) {
			return false;
		}

		// root@.com

		if (ea.startsWith("root@")) {
			return false;
		}

        return true;
	}

	public static boolean isName(String name) {
		if (isNull(name)) {
			return false;
		}

		char[] c = name.trim().toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (((!isChar(c[i])) &&
				(!Character.isWhitespace(c[i]))) ||
					(c[i] == ',')) {

				return false;
			}
		}

		return true;
	}

	public static boolean isNumber(String number) {
		if (isNull(number)) {
			return false;
		}

		char[] c = number.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (!isDigit(c[i])) {
				return false;
			}
		}

		return true;
	}

	public static boolean isNull(String s) {
		if (s == null) {
			return true;
		}

		s = s.trim();

		if ((s.equals(StringPool.NULL)) || (s.equals(StringPool.BLANK))) {
			return true;
		}

		return false;
	}

	public static boolean isNotNull(String s) {
		return !isNull(s);
	}
	public static boolean hasNotNull(String [] strings){
		for (String s : strings){
			if (isNotNull(s)) return true;
		}
		return false;
	}
	public static boolean areNotNull(String[] strings) {
		for (String s : strings){
			if (isNull(s)) return false;
		}
		return true;
	}

	public static boolean isPassword(String password) {
		if (isNull(password)) {
			return false;
		}

		if (password.length() < 4) {
			return false;
		}

		char[] c = password.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if ((!isChar(c[i])) &&
				(!isDigit(c[i]))) {

				return false;
			}
		}

		return true;
	}

	public static boolean isPhoneNumber(String phoneNumber) {
		return isNumber(StringUtil.extractDigits(phoneNumber));
	}
	
	public static boolean isSpecialChar(String s, ArrayList<Character> chars) {
		if (isNull(s)) {
			return false;
		}

		char[] c = s.toCharArray();
		
		boolean found = false;

		for (int i = 0; i < c.length; i++) {
			if (!(Character.isLetterOrDigit(c[i]))) {
				found = false;
				for (int j =0; j < chars.size(); j++){
					if (c[i] == chars.get(j)){
						//is special char
						found = true;
						break;
					}
				}
				if (!found)
					return false;
			}
		}

		return true;
	}

    // validates a valid web domain format, ex "domain.com"
    // TODO: fully enforce - see rules at http://www.theserverside.com/discussions/thread.tss?thread_id=41060
    public static boolean isDomainName(String domain) {

        if (isNull(domain)) {
			return false;
		}

		if (domain.length() < 6) {
			return false;
		}

        if(!domain.contains(StringPool.PERIOD)) {
            return false;
        }

        return true;
    }
}
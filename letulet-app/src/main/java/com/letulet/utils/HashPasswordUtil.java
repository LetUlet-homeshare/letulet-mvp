package com.letulet.utils;

import java.security.NoSuchAlgorithmException;

/**
 * Created by stephan on 09/11/17.
 */
public class HashPasswordUtil {

    // SHA1 Specific Hashing for legacy users

    private static String SHA1_HASH_SALT = "DYhG15gerhgb0ryJfIxfs2guVoUubWwvniR2G0FgaC9mi";

    public static String hash(String password) throws NoSuchAlgorithmException {

        return org.apache.commons.codec.digest.DigestUtils.sha1Hex(SHA1_HASH_SALT + password);
    }

    public static Boolean sha1PasswordHashesMatch(String clearPassword, String storedHash) {

        String processHash = org.apache.commons.codec.digest.DigestUtils.sha1Hex(SHA1_HASH_SALT + StringUtil.trimTrailing(clearPassword));

        if(processHash.equalsIgnoreCase(storedHash)) {
            return true;
        }
        return false;
    }
}

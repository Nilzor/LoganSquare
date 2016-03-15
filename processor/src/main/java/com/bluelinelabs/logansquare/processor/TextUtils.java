package com.bluelinelabs.logansquare.processor;

import java.util.Locale;

public class TextUtils {

    public static boolean isEmpty(String string) {
        return string == null || string.length() == 0;
    }

    public static String toUpperCaseWithUnderscores(String className) {
        StringBuilder sb = new StringBuilder();
        for (char c : className.toCharArray()) {
            if (c >= 'A' && c <= 'Z' && sb.length() > 0) {
                sb.append('_').append(c);
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

    public static String toLowerCaseWithUnderscores(String className) {
        StringBuilder sb = new StringBuilder();
        for (char c : className.toCharArray()) {
            if (c >= 'A' && c <= 'Z' && sb.length() > 0) {
                sb.append('_');
            }
            sb.append(Character.toLowerCase(c));
        }

        return sb.toString();
    }

    /** Converts first character to lower case */
    public static String toLowerCaseFirstChar(String text) {
        if (text.length() <= 1) return text.toLowerCase(Locale.ENGLISH);
        return ("" + text.charAt(0)).toLowerCase(Locale.ENGLISH) + text.substring(1);
    }

}

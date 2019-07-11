package com.goffity.stringutils.encoding;

public class ThaiUtils {

    public static String convertStringToUCS2(String s) {
        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int c = (int) ch;
            if (c < 127) {
                converted.append("00").append(Integer.toHexString(c));
            } else {
                converted.append("0").append(Integer.toHexString(c));
            }
        }

        return converted.toString().toUpperCase();
    }

    public static String unicodeCharacterstoJavaEntities(String str) {
        StringBuilder strBuilder = new StringBuilder();

        char[] ch = str.toCharArray();
        for (char value : ch) {
            int cha = (int) value;

            String c;

            if (cha < 127) {
                c = "00" + Integer.toHexString((int) value);
            } else {
                c = "0" + Integer.toHexString((int) value);
            }

            strBuilder.append("\\u");
            strBuilder.append(c.toUpperCase());
        }

        return strBuilder.toString();
    }

    public static String Unicode2ASCII(String unicode) {

        StringBuilder ascii = new StringBuilder(unicode);

        int code;

        for (int i = 0; i < unicode.length(); i++) {

            code = (int) unicode.charAt(i);

            if ((0xE01 <= code) && (code <= 0xE5B))

                ascii.setCharAt(i, (char) (code - 0xD60));

        }

        return ascii.toString();

    }

    public static String ASCII2Unicode(String ascii) {

        StringBuilder unicode = new StringBuilder(ascii);

        int code;

        for (int i = 0; i < ascii.length(); i++) {

            code = (int) ascii.charAt(i);

            if ((0xA1 <= code) && (code <= 0xFB))

                unicode.setCharAt(i, (char) (code + 0xD60));

        }

        return unicode.toString();

    }
}

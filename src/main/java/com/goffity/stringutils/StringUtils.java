package com.goffity.stringutils;

public class StringUtils {

    /**
     * Check string is empty or null value.
     *
     * @param string string want to check
     * @return {@code true} if length after trim is {@code 0} and string is null, otherwise return
     * false;
     * @since 1.0
     */
    public boolean isEmptyOrNull(String string) {
        boolean ret = false;

        if (string == null) {
            ret = true;
        } else if (string.trim().length() == 0) {
            ret = true;
        }

        return ret;
    }
}

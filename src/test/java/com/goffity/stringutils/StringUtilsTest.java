package com.goffity.stringutils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    StringUtils stringUtils;

    @Before
    public void setUp() throws Exception {
        stringUtils = new StringUtils();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEmptyOrNullWithNullShouldBeTrue() {

        String stringToTest = null;

        assertTrue(stringUtils.isEmptyOrNull(stringToTest));
    }

    @Test
    public void isEmptyOrNullWithEmptyStringShouldBeTrue() {

        String stringToTest = "";

        assertTrue(stringUtils.isEmptyOrNull(stringToTest));
    }

    @Test
    public void isEmptyOrNullWithEmptyStringAndSpaceShouldBeTrue() {

        String stringToTest = " ";

        assertTrue(stringUtils.isEmptyOrNull(stringToTest));
    }
}
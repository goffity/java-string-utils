package com.goffity.stringutils.encoding;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThaiUtilsTest {

    private String str = "";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        str = "ภาษาไทย";
    }

    @Test
    public void testConvertStringToUCS2() {
        System.out.println("testConvertStringToUCS2");

        String exp = "0E200E320E290E320E440E170E22";
        String result = ThaiUtils.convertStringToUCS2(str);

        System.out.println(result);

        assertEquals(exp, result);
    }

    @Test
    public void testUnicodeCharacterstoJavaEntities() {
        System.out.println("testUnicodeCharacterstoJavaEntities");

        String exp = "\\u0E20\\u0E32\\u0E29\\u0E32\\u0E44\\u0E17\\u0E22";
        String result = ThaiUtils.unicodeCharacterstoJavaEntities(str);

        System.out.println(result);

        assertEquals(exp, result);
    }

    @Test
    public void testUnicode2ASCII() {
        System.out.println("testUnicode2ASCII");

        String exp = "ÀÒÉÒä·Â";
        String result = ThaiUtils.Unicode2ASCII(str);

        System.out.println(result);

        assertEquals(exp, result);
    }

    @Test
    public void testASCII2Unicode() {
        System.out.println("testASCII2Unicode");

        String exp = "ภาษาไทย";
        String result = ThaiUtils.ASCII2Unicode(str);

        System.out.println(result);

        assertEquals(exp, result);
    }

}

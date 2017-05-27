package com.example.ryan.passwordvalidator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    Password passing = new Password("uhhuieh43");;
    Password failingPassword = new Password("password");;
    Password failingLength  = new Password("onetwo");;

    @Test
    public void password_not_null() throws Exception{
        assertNotNull(passing);
    }

    @Test
    public void passwordNotPassword() throws Exception{
        assertFalse(failingPassword.isPassed());
    }

    @Test
    public void passwordNotEight() throws Exception{
        assertFalse(failingLength.isPassed());
    }

}
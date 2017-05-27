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

    Password passing = new Password("Uhhu1i$eh93");
    Password failingPassword = new Password("password");
    Password failingLength  = new Password("onetwo");

    @Test
    public void password_not_null() throws Exception{
        assertNotNull(passing);
    }

    @Test
    public void passwordNotPassword() throws Exception{
        assertFalse(failingPassword.isPassword());
        assertTrue(passing.isPassword());
    }

    @Test
    public void passwordNotEight() throws Exception{
        assertFalse(failingLength.isOverEight());
        assertTrue(passing.isOverEight());
    }

    @Test
    public void passwordMissingUppercase() throws Exception{
        assertFalse(failingPassword.containsOneUpperCase());
        assertTrue(passing.containsOneUpperCase());
    }

    @Test
    public void passwordThreeDigits() throws Exception{
        assertFalse(failingPassword.containsThreeDigits());
        assertTrue(passing.containsThreeDigits());
    }

    @Test
    public void passwordContainsDollar() throws Exception{
        assertFalse(failingPassword.containsDollar());
        assertTrue(passing.containsDollar());
    }


}
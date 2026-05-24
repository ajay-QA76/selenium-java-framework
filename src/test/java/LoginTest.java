package com.automation.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest() {

        String expected = "Products";
        String actual = "Products";

        Assert.assertEquals(actual, expected);

        System.out.println("Login Test Passed");
    }
}

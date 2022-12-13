package com.herokuapp.internet.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssert {
    @Test
    public void testSum() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Running Test--------------->");
        Assert.assertTrue(result == 40);
        System.out.println("Line after assert 1");
        Assert.assertTrue(result == 30);
        System.out.println("Line after assert 2");


    }

    @Test
    public void testSum1() {
        SoftAssert softAssert = new SoftAssert();
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Running Test--------------->");
        softAssert.assertTrue(result == 40, "Result not equal to 40");
        System.out.println("Line after assert 1");
        softAssert.assertTrue(result == 30, "Result not equal to 30");
        System.out.println("Line after assert 2");
        softAssert.assertAll();
    }
}
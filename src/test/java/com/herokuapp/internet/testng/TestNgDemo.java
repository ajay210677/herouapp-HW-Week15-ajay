package com.herokuapp.internet.testng;

import org.testng.annotations.*;

public class TestNgDemo {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am in before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am in after method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I am in before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I am in after Test");
    }

    @Test
    public void test1() {
        System.out.println("I am in test1");
    }

    @Test
    public void test2() {
        System.out.println("I am in test2");

    }
}
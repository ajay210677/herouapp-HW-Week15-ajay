package com.herokuapp.internet.testng;

import org.testng.annotations.Test;

public class TestNGPriority {

    @Test(priority = 1)
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test(priority = 3)
    public void test2(){
        System.out.println("I am in test2");
    }


    @Test(priority = 2)
    public void test(){
        System.out.println("I am in test3");
    }

}

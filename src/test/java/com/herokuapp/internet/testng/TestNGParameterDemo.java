package com.herokuapp.internet.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {
    @Test
    @Parameters({"myName","surname"})
    public void test(@Optional("Ajay") String name,@Optional("Pandya") String surname){
        System.out.println("My name is : + name");
        System.out.println("My name is : + surname");
    }
}

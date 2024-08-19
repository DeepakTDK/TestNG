package org.deepak.day3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
    @BeforeSuite
    void bf(){
        System.out.println("before suite");
    }

    @BeforeTest
    void login(){
        System.out.println("login");
    }

    @Test
    void operation(){
        System.out.println("operation2");
    }

    @AfterTest
    void logout(){
        System.out.println("logout");
    }
}

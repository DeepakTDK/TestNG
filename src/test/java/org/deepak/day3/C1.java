package org.deepak.day3;

import org.testng.annotations.*;

public class C1 {
//    @BeforeMethod
//    void login(){
//        System.out.println("login");
//    }

//    @BeforeClass
//    void login(){
//        System.out.println("login");
//    }

    @Test
    void tc1(){
        System.out.println("tc1");
    }

    @Test
    void tc2(){
        System.out.println("tc2");
    }

//    @AfterMethod
//    void logout(){
//        System.out.println("logout");
//    }

//    @AfterClass
//    void logout(){
//        System.out.println("logout");
//    }

    @AfterSuite
    void af(){
        System.out.println("after suite");
    }

}

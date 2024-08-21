package org.deepak.day5;

import org.testng.annotations.Test;


public class LoginTests {
    @Test(priority = 1, groups = {"sanity"})
    void loginByFb(){
        System.out.println("loginbyfb");
    }

    @Test(priority = 2, groups = {"sanity"})
    void loginByEmail(){
        System.out.println("loginbyemail");
    }
}

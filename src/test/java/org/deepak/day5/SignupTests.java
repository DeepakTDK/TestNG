package org.deepak.day5;

import org.testng.annotations.Test;

public class SignupTests {
    @Test(priority = 1, groups = {"regression"})
    void signupByFb(){
        System.out.println("signupbyfb");
    }
    @Test(priority = 2, groups = {"regression"})
    void signupByEmail(){
        System.out.println("signupbyemail");
    }
}

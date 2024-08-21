package org.deepak.day5;

import org.testng.annotations.Test;

public class PaymentTests {
    @Test(priority = 1, groups = {"sanity", "regression", "functional"})
    void paymentByRazor(){
        System.out.println("paymentbyrazorpay");
    }
    @Test(priority = 2, groups = {"sanity", "regression", "functional"})
    void signupByStripe(){
        System.out.println("paymentbystripe");
    }
}

package com.company;
import org.junit.Assert;
import org.junit.Test;

public class CouponTests {
    Coupon coupon = new Coupon(3,5, 2021, "Alblasserdam");

    @Test
    public void geldigheidCouponTest(){
        Assert.assertTrue(coupon.geldigeCoupon(3,5, 2021,"Alblasserdam"));
        Assert.assertFalse(coupon.geldigeCoupon(1,5, 2021,"Alblasserdam"));
        Assert.assertFalse(coupon.geldigeCoupon(3,7, 2021,"Alblasserdam"));
        Assert.assertFalse(coupon.geldigeCoupon(3,5, 2021,"Den Haag"));
    }
}

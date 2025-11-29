package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
    }

    @Override
    public void bookProduct(float charges) {
        // Feature: Normal accounts MUST include delivery charges
        float deliveryCharges = getDeliveryCharges();
        float total = charges + deliveryCharges;
        
        System.out.println("Dear Normal User, Your Charges are: " + charges + " with Delivery Charges: " + deliveryCharges);
        System.out.println("Total Amount: " + total); 
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

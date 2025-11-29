package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	// Constructor matching the fields from the abstract class
    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float charges) {
        // Feature: Prime accounts does not have delivery charges
        System.out.println("Dear Prime User, Your Product Charges are: " + charges);
    }

    @Override
    public String toString() {
        // Reuse the parent's toString and add specific details if needed
        return super.toString(); 
    }
}

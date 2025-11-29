package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	
	//Fields
	private boolean isPrime;
    private static final float deliveryCharges = 0.0f; //free delivery for prime users.
    
    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges); // Passes data to parent ShopAcc
        this.isPrime = isPrime;
    }
    
    @Override
    public void bookProduct(float charges) {
        // Implementation will be done in the Concrete class (GSPrimeAcc)
    }

    @Override
    public String toString() {
        return super.toString() + " PrimeAcc [isPrime=" + isPrime + "]";
    }
    
    public boolean getIsPrime() { return isPrime; }
}


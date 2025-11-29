package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	@Override
    public void bookProduct(float charges) {
        // Implementation will be done in GSNormalAcc
    }
	
	@Override
    public String toString() {
        return super.toString() + " NormalAcc [deliveryCharges=" + deliveryCharges + "]";
    }
    
    public float getDeliveryCharges() { return deliveryCharges; }
}

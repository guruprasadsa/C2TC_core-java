package com.tns.framework;

public abstract class ShopAcc {
	//Fields
	private int accNo;
    private String accNm;
    private float charges;
    
    //constructor from Fields
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	public void bookProduct(float charges) {
        // Logic to update charges (Generic implementation)
        System.out.println("Product booked and charges are:" + charges);
    }

    public void items(float itemPrice) {
        System.out.println("Items added with price: " + itemPrice);
    }

    @Override
    public String toString() {
        return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
    }
    
    // Getters 
    public int getAccNo() { return accNo; }
    public String getAccNm() { return accNm; }
    public float getCharges() { return charges; }
    // Setter for charges
    public void setCharges(float charges) { this.charges = charges; }

}

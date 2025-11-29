package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
    public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
        // Factory explicitly returns the Specific GoShopping Prime Account
        GSPrimeAcc primeacc = new GSPrimeAcc(accNo, accNm, charges, isPrime);
        return primeacc;
    }

    @Override
    public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
        // Factory explicitly returns the Specific GoShopping Normal Account
        GSNormalAcc normalacc = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
        return normalacc;
    }

}

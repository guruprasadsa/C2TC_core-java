package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

    public static void main(String[] args) {
        
        //Assign instance of GSShopFactory to ShopFactory
        ShopFactory shopFactory = new GSShopFactory();
        
        //Instantiate GSPrimeAcc and refer it through reference PrimeAcc
        // We use the factory method to create the object.
        PrimeAcc primeAcc = shopFactory.getNewPrimeAccount(101, "Prime User", 1000, true);
        
        //Instantiate GSNormalAcc and refer it through reference NormalAcc
        NormalAcc normalAcc = shopFactory.getNewNormalAccount(102, "Normal User", 1000, 50);
        
        // Invoke bookProduct() method 
        // For Prime Account
        System.out.println(" Prime Account Booking ");
        primeAcc.bookProduct(500); 
        
        // For Normal Account
        System.out.println("\n Normal Account Booking ");
        normalAcc.bookProduct(500);
        
        //Invoke toString() method
        System.out.println("\n Account Details ");
        System.out.println(primeAcc.toString());
        System.out.println(normalAcc.toString());
    }
}
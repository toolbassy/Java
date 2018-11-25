package com.company;

import java.util.Random;

public class Main {
    public static Currency currency;



    public static void main(String[] var0) throws InterruptedException {
        currency = new Currency();
        new DisplayCurrency(currency);
        new DisplayDifference(currency);

        while(true) {
            changeValues();
            Thread.sleep(1000L);
        }
    }

    public static void changeValues() {
        double var5 = (Math.random()*2) -1;
        double var9 = (Math.random()*2) -1;
        double var13 =(Math.random()*2)- 1;

        currency.setMoney(var5, var9, var13);
    }
}

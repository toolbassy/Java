package com.company;

public class DisplayCurrency implements Observer, DisplayElement {
    private double euro;
    private double dollar;
    private Subject currency;
    private double lira;

    public DisplayCurrency(Subject var1) {
        this.currency = var1;
        var1.registerObserver(this);
    }

    public void update(double var1, double var3, double var5) {
        this.euro = var1;
        this.dollar = var3;
        this.lira = var5;
        this.display();
    }

    public void display() {
        System.out.printf("Current values:        €%-5.2f......$%-5.2f......₺%-5.2f%n", this.euro, this.dollar, this.lira);
    }
}

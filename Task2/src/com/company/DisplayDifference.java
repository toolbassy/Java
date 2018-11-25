package com.company;

public class DisplayDifference implements Observer, DisplayElement {
    private double euro = 0.0D;
    private double dollar = 0.0D;
    private double lira = 0.0D;
    private Subject currency;

    public DisplayDifference(Subject var1) {
        this.currency = var1;
        var1.registerObserver(this);
    }

    public void update(double var1, double var3, double var5) {
        if (((Currency)this.currency).gete() == this.euro) {
            this.euro = 0.0D;
        } else {
            this.euro = ((Currency)this.currency).gete();
        }

        if (this.dollar == ((Currency)this.currency).getd()) {
            this.dollar = 0.0D;
        } else {
            this.dollar = ((Currency)this.currency).getd();
        }

        if (this.lira == ((Currency)this.currency).getl()) {
            this.lira = 0.0D;
        } else {
            this.lira = ((Currency)this.currency).getl();
        }

        this.display();
    }

    public void display() {
        System.out.printf("Dif current val:        €%-5.2f......$%-5.2f......₺%-5.2f%n", this.euro, this.dollar, this.lira);
    }
}

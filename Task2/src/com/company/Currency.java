package com.company;

import java.util.ArrayList;

public class Currency implements Subject {
    private ArrayList observers = new ArrayList();
    private double euro = 418.86D;
    private double dollar = 355.88D;
    private double lira = 56.55D;
    private double currenteuro = 418.86D;
    private double currentdollar = 355.88D;
    private double currentlira = 56.55D;
    private double changeeuro = 418.86D;
    private double changedollar = 355.88D;
    private double changelira = 56.55D;
    private double e = 0.0D;
    private double d = 0.0D;
    private double l = 0.0D;

    public Currency() {
    }

    public void registerObserver(Observer var1) {
        this.observers.add(var1);
    }

    public void removeObserver(Observer var1) {
        int var2 = this.observers.indexOf(var1);
        if (var2 >= 0) {
            this.observers.remove(var2);
        }

    }

    public void notifyObservers() {
        for(int var1 = 0; var1 < this.observers.size(); ++var1) {
            Observer var2 = (Observer)this.observers.get(var1);
            var2.update(this.euro, this.dollar, this.lira);
        }

    }

    public void moneyChanged() {
        this.notifyObservers();
    }

    public void setMoney(double var1, double var3, double var5) {
        if (Math.abs(this.changeeuro - this.currenteuro) < 2.0D && Math.abs(this.changedollar - this.currentdollar) < 2.0D && Math.abs(this.changelira - this.currentlira) < 2.0D) {
            this.changeeuro += var1;
            this.changelira += var5;
            this.changedollar += var3;
        } else {
            if (Math.abs(this.changeeuro - this.currenteuro) >= 2.0D) {
                this.e = this.changeeuro - this.currenteuro;
                this.currenteuro = this.changeeuro;
                this.euro = this.currenteuro;
            }

            if (Math.abs(this.changedollar - this.currentdollar) >= 2.0D) {
                this.d = this.changedollar - this.currentdollar;
                this.currentdollar = this.changedollar;
                this.dollar = this.currentdollar;
            }

            if (Math.abs(this.changelira - this.currentlira) >= 2.0D) {
                this.l = this.changelira - this.currentlira;
                this.currentlira = this.changelira;
                this.lira = this.currentlira;
            }

            this.moneyChanged();
        }

    }

    public double getEuro() {
        return this.euro;
    }

    public double getDollar() {
        return this.dollar;
    }

    public double getLira() {
        return this.lira;
    }

    public double gete() {
        return this.e;
    }

    public double getd() {
        return this.d;
    }

    public double getl() {
        return this.l;
    }
}

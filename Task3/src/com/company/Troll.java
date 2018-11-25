package com.company;


public class Troll extends Monster {
    public Troll(){
        Attack="The Troll tries to grab you!";
        FleeBattle="The Troll shrieks in horror and runs away!";
    }

    @Override
    public double getAttackPower() {
        return 60;
    }




}

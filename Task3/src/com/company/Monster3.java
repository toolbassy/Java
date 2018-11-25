package com.company;


public class Monster3 extends Monster {
    public Monster3() {
        Attack="The Djin tries to grab you!";
        FleeBattle="The Djin shrieks in horror and runs away!";
    }

    @Override
    public double getAttackPower() {
        return 10;
    }


}

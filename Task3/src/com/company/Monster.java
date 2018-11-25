package com.company;

public abstract class Monster {
    String Attack;
    String FleeBattle;
    public String attack() {
        return Attack;
    }

    public String fleebattle() {
        return FleeBattle;
    }

    public abstract double getAttackPower();
}

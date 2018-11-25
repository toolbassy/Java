package com.company;

public class Test {
    public static void main(String[] args) {
        Monster troll = new Troll();
        Monster mon2 = new Monster2();
        Monster mon3 = new Monster3();

        System.out.println(mon3.getAttackPower()+"\n"+mon3.attack()+"\n"+mon3.fleebattle());

        troll = new Club(troll);
        System.out.println(troll.getAttackPower()+"\n"+troll.attack()+"\n"+troll.fleebattle());

        mon2  =  new Dec2(mon2);
        System.out.println(mon2.getAttackPower()+"\n"+mon2.attack()+"\n"+mon2.fleebattle());

        troll = new Dec3(troll);
        System.out.println(troll.getAttackPower()+"\n"+troll.attack()+"\n"+troll.fleebattle());

    }

}

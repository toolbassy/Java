package com.company;

public class Dec3 extends MonsterDecarator{
    Monster monster;
    String name="";

    public Dec3(Monster monster) {
        this.monster=monster;
    }

    @Override
    public String attack() {
        if(monster.attack().substring(4,9).equals("Troll")) {
            name="Troll";
        }else if(monster.attack().substring(4,19).equals("ZhalmauyzKempir")) {
            name="ZhalmauyzKempir";
        }
        return monster.attack()+" .The " +name+" swings at you with a Sadakh!";
    }

    @Override
    public String fleebattle() {
        if(monster.attack().substring(4,9).equals("Troll")) {
            name="Troll";
        }else if(monster.attack().substring(4,19).equals("ZhalmauyzKempir")) {
            name="ZhalmauyzKempir";
        }
        return monster.fleebattle()+". The "+name+ " swings at you with a Sadakh!";
    }

    @Override
    public double getAttackPower() {
        return 40+monster.getAttackPower();
    }
}

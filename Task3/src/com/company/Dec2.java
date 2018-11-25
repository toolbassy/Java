package com.company;

public class Dec2 extends MonsterDecarator {
    Monster monster;
    String name="";

    public Dec2(Monster monster) {
        this.monster=monster;
    }

    @Override
    public String attack() {
        if(monster.attack().substring(4,9).equals("Troll")) {
            name="Troll";
        }else if(monster.attack().substring(4,19).equals("ZhalmauyzKempir")) {
            name="ZhalmauyzKempir";
        }
        return monster.attack()+" .The " +name+" swings at you with a Khylysh!";
    }

    @Override
    public String fleebattle() {
        if(monster.attack().substring(4,9).equals("Troll")) {
            name="Troll";
        }else if(monster.attack().substring(4,19).equals("ZhalmauyzKempir")) {
            name="ZhalmauyzKempir";
        }
        return monster.fleebattle()+". The "+name+ " swings at you with a Khylysh!";
    }

    @Override
    public double getAttackPower() {
        return 30 +monster.getAttackPower();
    }


}

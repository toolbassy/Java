package com.company;

public class Club extends MonsterDecarator{
    Monster monster;
    String name = "";


    public Club(Monster monster) {
        this.monster=monster;
    }
    @Override
    public String attack() {
        if(monster.attack().substring(4,9).equals("Troll")) {
            name="Troll";
        }else if(monster.attack().substring(4,19).equals("ZhalmauyzKempir")) {
            name="ZhalmauyzKempir";
        }
        return monster.attack()+".The " +name+" swings at you with a club!";
    }
    @Override
    public String fleebattle() {
        if(monster.attack().substring(4,9).equals("Troll")) {
            name="Troll";
        }else if(monster.attack().substring(4,19).equals("ZhalmauyzKempir")) {
            name="ZhalmauyzKempir";
        }
        return monster.fleebattle()+". The "+name+ " loses this club while running.";
    }

    @Override
    public double getAttackPower() {
        return 25+monster.getAttackPower();
    }


}

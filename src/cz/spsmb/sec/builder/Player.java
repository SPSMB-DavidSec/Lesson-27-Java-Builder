package cz.spsmb.sec.builder;

import cz.spsmb.sec.builder.builders.PlayerBuilder;

/**
 * name, age, spritePath, hp, mana a xp
 */
public class Player {
    private String name;
    private int age;
    private String spritePath;
    private int hp;
    private int mana;
    private int xp;

    public Player(String name, int mana){
        this.name = name;
        this.mana = mana;
    }

    public Player(String name, int age, String spritePath, int hp, int mana, int xp) {
        this.name = name;
        this.age = age;
        this.spritePath = spritePath;
        this.hp = hp;
        this.mana = mana;
        this.xp = xp;
    }

    public static PlayerBuilder builder(){
        return new PlayerBuilder();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", spritePath='" + spritePath + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", xp=" + xp +
                '}';
    }
}

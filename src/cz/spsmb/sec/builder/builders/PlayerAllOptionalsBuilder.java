package cz.spsmb.sec.builder.builders;

import cz.spsmb.sec.builder.Player;

public class PlayerAllOptionalsBuilder {
    int mana;
    String name;
    private int age;
    private String spritePath;
    private int hp;
    private int xp;

    public PlayerAllOptionalsBuilder(String name, int mana){
        this.name = name;
        this.mana = mana;
    }

    public PlayerAllOptionalsBuilder addAge(int age){
        this.age = age;
        return this;
    }

    public PlayerAllOptionalsBuilder addSpritePath(String spritePath){
        this.spritePath = spritePath;
        return this;
    }

    public PlayerAllOptionalsBuilder addHp(int hp){
        this.hp = hp;
        return this;
    }

    public PlayerAllOptionalsBuilder addXp(int xp){
        this.xp = xp;
        return this;
    }

    public Player build(){
        if (this.name == null || this.mana == 0){
            throw new IllegalArgumentException("Name and mana must be filled.");
        }
        return new Player(name, age, spritePath, hp, mana, xp);
    }
}

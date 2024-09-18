package cz.spsmb.sec.builder.builders;

import cz.spsmb.sec.builder.Player;

public class PlayerBuilder {

    private String name;
    private int age;
    private String spritePath;
    private int hp;
    private int mana;
    private int xp;

    public PlayerBuilder addName(String name){
        this.name = name;
        return this;
    }

    public PlayerBuilder addAge(int age){
        this.age = age;
        return this;
    }

    public PlayerBuilder addSpritePath(String spritePath){
        this.spritePath = spritePath;
        return this;
    }

    public PlayerBuilder addHp(int hp){
        this.hp = hp;
        return this;
    }

    public PlayerBuilder addMana(int mana){
        this.mana = mana;
        return this;
    }

    public PlayerBuilder addXp(int xp){
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

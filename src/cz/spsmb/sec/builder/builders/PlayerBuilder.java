package cz.spsmb.sec.builder.builders;

import cz.spsmb.sec.builder.Player;

public class PlayerBuilder {

    private String name;


    public PlayerManaBuilder addName(String name){
        this.name = name;
        return new PlayerManaBuilder(name);
    }




}

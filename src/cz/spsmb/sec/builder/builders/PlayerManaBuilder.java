package cz.spsmb.sec.builder.builders;

public class PlayerManaBuilder {
    int mana;
    String name;

    public PlayerManaBuilder(String name){
        this.name = name;
    }

    public PlayerAllOptionalsBuilder addMana(int mana){
        this.mana = mana;
        return new PlayerAllOptionalsBuilder(this.name, this.mana);
    }
}

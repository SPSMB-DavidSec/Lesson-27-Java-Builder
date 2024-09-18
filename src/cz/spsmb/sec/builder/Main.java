package cz.spsmb.sec.builder;

public class Main {

    public static void main(String[] args) {
        Coordinates coordinates = Coordinates.builder()
                .addLongtitude("50.415971210138174").addLatitude("14.904883975194343")
                .build();

        System.out.println(coordinates);

        Player player = Player.builder().addName("David").addMana(10)
                .addAge(18).addHp(100)
                .build();
        System.out.println(player);
    }
}

package cz.spsmb.sec.builder;

import cz.spsmb.sec.builder.builders.CoordinatesBuilder;

public class Coordinates {
    String longtitude;
    String latitude;

    public Coordinates(String longtitude, String latitude){
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    public static CoordinatesBuilder builder(){
        return new CoordinatesBuilder();
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "longtitude='" + longtitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }
}

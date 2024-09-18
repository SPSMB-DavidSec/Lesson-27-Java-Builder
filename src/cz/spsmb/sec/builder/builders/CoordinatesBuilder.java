package cz.spsmb.sec.builder.builders;

import cz.spsmb.sec.builder.Coordinates;

public class CoordinatesBuilder {
    String longtitude;
    String latitude;

    public CoordinatesBuilder addLongtitude(String longtitude){
        this.longtitude = longtitude;
        return this;
    }

    public CoordinatesBuilder addLatitude(String latitude){
        this.latitude = latitude;
        return this;
    }

    public Coordinates build(){
        if ((longtitude == null || longtitude.isEmpty()) || (latitude == null || latitude.isEmpty())){
            throw new IllegalArgumentException("Longtitude and Latitude must be filled.");
        }
        return new Coordinates(longtitude, latitude);
    }

}

package BeerHelper;

import java.sql.Time;

public class Hop {
    private String name;
    private  int citric;
    private double alphaSour;
    private String heatingTime;

    public Hop(String name, int citric, double alphaSour, String heatingTime) {
        this.name = name;
        this.citric = citric;
        this.alphaSour = alphaSour;
        this.heatingTime = heatingTime;
    }


    public boolean isAlphaSour () {
        if (alphaSour < 8) {
            return true;
        } else return false;
    }

}

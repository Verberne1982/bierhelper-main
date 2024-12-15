package BeerHelper;

import java.util.ArrayList;

public class Grain {
    private String name;
    private int darkness;
    private int foamThickness;
    private String heatingTime;

    public Grain(String name, int darkness, int foamThickness, String heatingTime) {
        this.name = name;
        this.darkness = darkness;
        this.foamThickness = foamThickness;
        this.heatingTime = heatingTime;
    }

    public String getName() {
        return this.name;
    }

    public String getHeatingTime() {
        return this.heatingTime;
    }

    public int getDarkness() {
        return this.darkness;
    }

    public int getFoamThickness() {
        return this.foamThickness;
    }

    @Override
    public String toString() {
        return this.name + this.heatingTime;
    }
}



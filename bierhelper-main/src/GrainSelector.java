// Maak 1 methode voor alle ingredienten
// de else if statement afmaken met math.round??
// println array maakt hashcode

package BeerHelper;

import java.util.ArrayList;

public class GrainSelector {

    public Object grainCalc(TasteProfile tasteProfile) {

        int x = tasteProfile.getDonkerLicht();
        int y = tasteProfile.getSchuimKraag();


        ArrayList<Grain> grain = DummyData.setGrain();
        for (Grain useableGrain : grain) {

            if (useableGrain.getDarkness() == x && useableGrain.getFoamThickness() == y) {
                return "Naam: " + useableGrain.getName() + "\n" + "Verwarmingstijd: "+ useableGrain.getHeatingTime();
            }
            else if (useableGrain.getDarkness() != x || useableGrain.getFoamThickness() == y) {
            //  uitvinden hoe te implementeren
            }
        }
        return null;    //Waarom moet hier null worden ingegeven?
    }
}




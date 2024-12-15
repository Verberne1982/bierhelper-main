//DummyData stelt database voor, derhalve niet in klassediagram

package BeerHelper;

import java.util.ArrayList;

// ArrayList met Grain objects
public class DummyData {

    public static ArrayList<Grain> setGrain() {

        ArrayList<Grain> grains = new ArrayList<>();

        grains.add(new Grain("Maris Otter", 1, 1, "1 Hour"));
        grains.add(new Grain("Pale ale", 1, 2, "1.5 hours"));
        grains.add(new Grain("muncher", 2, 2, "2 hours"));
        grains.add(new Grain("Carahell", 2, 3, "1 hour"));
        grains.add(new Grain("Caramel 120", 3, 3, "1.5 hours"));
        grains.add(new Grain("Caramel 160", 4, 2, "2 hours"));
        grains.add(new Grain("Biscuit", 4, 4, "1.5 hours"));
        grains.add(new Grain("Brown malt", 4, 1, "2 hours"));
        grains.add(new Grain("Roasted black", 5, 5, "3 hours"));
        grains.add(new Grain("Special B", 5, 1, "1 hour"));

        return grains;
    }

    // ArrayList met Hop objects
    public static ArrayList<Hop> setHop() {

        ArrayList<Hop> hops = new ArrayList<>();

        hops.add(new Hop("Cascade", 1, 4.5, "45 minuten"));
        hops.add(new Hop("Hallertau", 1, 7.8, "0.5 uur"));
        hops.add(new Hop("Opal", 2, 11, "2 uur"));
        hops.add(new Hop("Tomahawk", 2, 6.6, "1 uur"));
        hops.add(new Hop("Zeus", 3, 15, "1uur 45 minuten"));
        hops.add(new Hop("Columbus", 3, 14.3, "1 uur"));
        hops.add(new Hop("Magnum", 4, 5.6, "30 minuten"));
        hops.add(new Hop("Nugget", 4, 13.2, "1 hour 30 minuten"));
        hops.add(new Hop("Target", 5, 4, "1 uur"));
        hops.add(new Hop("Saaz", 5, 8.1, "45 minuten"));

        return hops;
    }
    // ArrayList met Herb objects true = flowers false = herbs
    public static ArrayList<Herb> setHerb() {

        ArrayList<Herb> herbs = new ArrayList<>();

        herbs.add(new Herb("Sinaasappelschil", true, "20 minuten"));
        herbs.add(new Herb("Koriander", false, "30 minuten"));
        herbs.add(new Herb("Zoethout", true, "10 minuten"));
        herbs.add(new Herb("Steranijs", true, "15 minuten"));
        herbs.add(new Herb("Jeneverbes", false, "10 minuten"));
        herbs.add(new Herb("Kruidnagel", false, "5 minuten"));

        return herbs;
    }

    // ArrayList met Yeast objects
    public static ArrayList<Yeast> setYeast() {

        ArrayList<Yeast> yeasts = new ArrayList<>();

        yeasts.add(new Yeast("Rochefort", true));
        yeasts.add(new Yeast("Noble Saison", false));
        yeasts.add(new Yeast("Whitebread", true));
        yeasts.add(new Yeast("Czech Pilsener", false));
        yeasts.add(new Yeast("French Cider", true));

        return yeasts;
    }


}

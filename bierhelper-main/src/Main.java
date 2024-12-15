//Main alleen gebruiken voor initieren van TasteProfile klasse

package BeerHelper;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static String flowersHerbs(){
        System.out.println("Houd u van bloemige of kruidige geuren?");
        String bloemigKruidig = Main.scanner.nextLine();
        if (bloemigKruidig.isBlank()) {
            System.out.println("Typ iets in");
        } else if (!bloemigKruidig.equals("bloemig") && !bloemigKruidig.equals("kruidige")) {
            System.out.println("verkeerd input");
        }
        return bloemigKruidig;
    }
    public static String citricSour(){
        System.out.println("Houd u van citrus of zurig fruit?");
        String citricSour = scanner.nextLine();
        if (citricSour.isBlank()) {
            System.out.println("Typ iets in");
        } else if (!citricSour.equals("tropisch") && !citricSour.equals("zurig")) {
            System.out.println("verkeerd input");
        }
        return citricSour;
    }

    public static int ebc(){
        System.out.println("Houdt u van licht of donker bier ? (1...5)");
        Integer ebc = scanner.nextInt();
        if (ebc < 1 && ebc > 5) {
            System.out.println("verkeerde input");
        }
        return ebc;
    }
    public static int foamThickness(){
        System.out.println("Wat voor schuimkraag wilt u? (1...5)");
        Integer foamThickness = scanner.nextInt();
        if (foamThickness < 1 && foamThickness > 5) {
            System.out.println("Verkeerde input");
        }
        return foamThickness;
    }

    public static void main(String[] args) {

        System.out.println("Welkom bij de BeerHelper");
        System.out.println("de one-stop shop voor bier recepten!\n");
        System.out.println("Begin met het invullen van uw smaakprofiel:\n");


        System.out.println("Welk Bier wilt u brouwen?\nPils = 1\nStout = 2\nTripel = 3\nIPA = 4\n ");

        int beer = scanner.nextInt();
        switch (beer) {

            case 1: //pils  1x graan    1xhop
                int ebcPils = ebc();
                int foamThicknessPils = foamThickness();
                TasteProfile tasteProfilePils = new TasteProfile(ebcPils, foamThicknessPils);
                GrainSelector grainSelector = new GrainSelector();
                System.out.println(grainSelector.grainCalc(tasteProfilePils));
                break;
            case 2: //stout 1x graan hoog ebc   1x hop  1x kruiden
                int ebcStout = ebc();
                int foamThicknessStout = foamThickness();
                String flowerHerbStout = flowersHerbs();
                TasteProfile tasteProfileStout = new TasteProfile(ebcStout, foamThicknessStout, flowerHerbStout);
                break;
            case 3: //tripel    2x graan    2x hop  0...* kruiden
            case 4: //IPA   1x graan    2x hop  0...* kruiden
                int ebcTripel = ebc();
                int foamThicknessTripel = foamThickness();
                String flowerHerbsTripel = flowersHerbs();
                String citricSourTripel = citricSour();
                TasteProfile tasteProfileTripel = new TasteProfile(ebcTripel, foamThicknessTripel, flowerHerbsTripel, citricSourTripel);
                break;
            default: {
                System.out.println("Verkeerde input");
            }
        }

    }
       /* public enum FlowersHerbs {
            flower,
            herbs
        }
        public enum CitricSour {
            citric,
            sour
        }*/

}



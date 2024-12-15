package BeerHelper;
public class TasteProfile {
    //  fields
// Ctor overload tbv biertype
    private String bloemigKruidig;
    private String tropischZurig;
    private int donkerLicht;
    private int schuimKraag;

    //  props

    public String getBloemigKruidig() {return this.bloemigKruidig;}
    public String getTropischZurig() {return this.tropischZurig;}
    public int getDonkerLicht() {return this.donkerLicht;}
    public int getSchuimKraag() {return this.schuimKraag;}

    //  constructor

    public TasteProfile(int donkerLicht, int schuimKraag){
        this.donkerLicht = donkerLicht;
        this.schuimKraag = schuimKraag;
    }

    public TasteProfile(int donkerLicht, int schuimKraag, String bloemigKruidig){
        this.donkerLicht = donkerLicht;
        this.schuimKraag = schuimKraag;
        this.bloemigKruidig = bloemigKruidig;
    }
    public TasteProfile(int donkerLicht, int schuimKraag, String bloemigKruidig, String tropischZurig) {
        this.bloemigKruidig = bloemigKruidig;
        this.tropischZurig =  tropischZurig;
        this.donkerLicht = donkerLicht;
        this.schuimKraag = schuimKraag;
    }








}

// Mag weg als alles goed werkt

package BeerHelper;

import java.util.ArrayList;

public class IngredientsGetter {

    private ArrayList<Grain> grainArrayList;
    private ArrayList<Hop> hopArrayList;
    private ArrayList<Herb> herbArrayList;
    private ArrayList<Yeast> yeastArrayList;


    public IngredientsGetter(final ArrayList<Grain> grainArrayList, final ArrayList<Hop> hopArrayList, final ArrayList<Herb> herbArrayList, final ArrayList<Yeast> yeastArrayList) {
        this.grainArrayList = DummyData.setGrain();
        this.hopArrayList = DummyData.setHop();
        this.herbArrayList = DummyData.setHerb();
        this.yeastArrayList = DummyData.setYeast();
    }

    public ArrayList<Grain> getGrainArrayList() {
        return this.grainArrayList;
    }
    public ArrayList<Hop> getHopArrayList() { return this.hopArrayList; }
    public ArrayList<Herb> getHerbArrayList() { return this.herbArrayList; }
    public ArrayList<Yeast> getYeastArrayList() { return this.yeastArrayList; }
}

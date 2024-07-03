package Part06_08_CargoHold;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tribe
 */
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        for (Suitcase s: suitcases) {
            currentWeight += s.totalWeight();
        }
        if ((currentWeight + suitcase.totalWeight()) <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    public String toString() {
        int totalWeight = 0;
        for (Suitcase s : suitcases) {
            totalWeight += s.totalWeight();
        }
        return suitcases.size() + " suitcases (" + totalWeight + "kg)";
    }
    public void printItems() {
        for(Suitcase s: suitcases){
            s.printItems();
        }
    }

}

package Part06_08_CargoHold;


import Part06_07_HeightOrder.Person;

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
    public boolean isEmpty() {
        return suitcases.isEmpty();
    }
    public String toString() {
        bubbleSortSuitcasesByWeight(); // Sort suitcases before creating the string

        int totalWeight = 0;
        for (Suitcase s : suitcases) {
            totalWeight += s.totalWeight();
        }
        return suitcases.size() + " suitcases (" + totalWeight + "kg)";
    }
    public void printItems() {
        bubbleSortSuitcasesByWeight(); // Sort suitcases before printing

        for (int i = 0; i < suitcases.size(); i++) {
            Suitcase s = suitcases.get(i);
            System.out.println("Suitcase " + (i+1) + " (Weight: " + s.totalWeight() + " kg):");
            s.printItems();
            System.out.println(); // Add a blank line between suitcases
        }
    }
    public Suitcase lightest() {
        if (this.suitcases.isEmpty()) {
            return null;
        }
        Suitcase returnObject = this.suitcases.get(0);

        for (Suitcase s: this.suitcases) {
            if (returnObject.totalWeight() < s.totalWeight()) {
                returnObject = s;
            }
        }
        return returnObject;
    }
    public void printWeight() {
        int currentWeight = 0;
        for (Suitcase s: suitcases) {
            currentWeight += s.totalWeight();
        }
        System.out.println("Total weight is " + currentWeight + " kg");
    }
    public void bubbleSortSuitcasesByWeight() {
        int n = suitcases.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (suitcases.get(j).totalWeight() > suitcases.get(j + 1).totalWeight()) {
                    // Swap suitcases[j+1] and suitcases[i]
                    Suitcase temp = suitcases.get(j);
                    suitcases.set(j, suitcases.get(j + 1));
                    suitcases.set(j + 1, temp);
                }
            }
        }
    }


}

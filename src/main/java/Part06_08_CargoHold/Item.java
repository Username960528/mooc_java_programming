package Part06_08_CargoHold;


public class Item {

    private String name;
    private double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + "(" + this.weight + " kg)";
    }

}

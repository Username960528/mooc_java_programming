package PrintCollection;


import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String elementWord = (this.elements.size() == 1) ? "element" : "elements";
        String printOutput = "The collection " + this.name + " has " + this.elements.size() + " " + elementWord + ":" + "\n";
        String noOutput = "The collection " + this.name + " is empty.\n";
        if (elements.isEmpty()) {
            return noOutput;
        }
        String collection = "";
        for (String element : elements) {
            collection = collection + element + "\n";
        }
        return (printOutput + collection).trim();
    }

}

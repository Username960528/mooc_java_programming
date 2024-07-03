package Part06_07_HeightOrder;


import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list = new ArrayList<>();

    public Room() {
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return new ArrayList<>(list);
    }
    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person returnObject = this.list.get(0);

        for (Person prs: this.list) {
            if (returnObject.getHeight() < prs.getHeight()) {
                returnObject = prs;
            }
        }
        return returnObject;


    }
    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person returnObject = this.shortest();
        this.list.remove(returnObject);
        return returnObject;
    }
}


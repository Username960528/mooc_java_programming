package Part06_08_CargoHold;

public class Main {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        Item sleepingBag = new Item("SleepingBag", 10.5);


        Suitcase adasCase = new Suitcase(10);
        Suitcase backpack = new Suitcase(20);
        backpack.addItem(sleepingBag);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(20);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        hold.addSuitcase(backpack);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printWeight();
        hold.printItems();



    }
}

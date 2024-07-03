package Part06_08_CargoHold;

import java.util.ArrayList;



    public class Suitcase {

        private ArrayList<Item> items = new ArrayList<>();
        private int maxWeight = 0;

        public Suitcase(int maxWeight) {
            this.items = new ArrayList<>();
            this.maxWeight = maxWeight;

        }

        public void addItem(Item item) {
            int currentWeight = getCurrectWeight();
            if ((currentWeight + item.getWeight()) <= maxWeight) {
                items.add(item);
            }

        }
        private int getCurrectWeight() {
            int totalWeight = 0;
            for(Item per: items) {
                totalWeight += per.getWeight();
            }
            return totalWeight;
//            this.items.stream().mapToInt(Item::getWeight).sum();
        }
        public String toString() {
            int totalWeight = getCurrectWeight();
            if (items.isEmpty()) {
                return "no items (0 kg)";
            } else if(items.size() == 1) {
                return "1 item (" + totalWeight + " kg)";
            } else {
                return items.size() + " items (" + totalWeight + " kg)";
            }
        }

    }




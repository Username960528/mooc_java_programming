package Part05_11_ComparingApartments;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squareMeters = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
//        if (this.rooms > compared.rooms) {
//            return true;
//        }
//        if (this.rooms < compared.rooms) {
//            return false;
//        }
//        if (this.squares > compared.squares) {
//            return true;
//        }
//        if (this.squares < compared.squares) {
//            return false;
//        }
        if (this.rooms != compared.rooms) {
            return this.rooms > compared.rooms;
        }
        if (this.squareMeters != compared.squareMeters) {
            return this.squareMeters > compared.squareMeters;
        }
        return this.pricePerSquare < compared.pricePerSquare;
//        return this.pricePerSquare < compared.pricePerSquare;

    }

    private int totalPrice() {
        return this.squareMeters * this.pricePerSquare;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.totalPrice() - compared.totalPrice());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.totalPrice() > compared.totalPrice();
    }

}

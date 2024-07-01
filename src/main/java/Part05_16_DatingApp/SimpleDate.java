package Part05_16_DatingApp;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day++;
        if (this.day > 30) {
            this.day = 1;
            this.month++;
            if (month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void advance(int howManyDays) {
//        for (int i = 0; i < howManyDays; i++) {
//            advance();
//        }
        int totalDays = this.day + howManyDays;
        int monthsToAdd = (totalDays - 1) / 30;
        this.day = ((totalDays - 1) % 30) + 1;

        int totalMonths = this.month + monthsToAdd;
        int yearsToAdd = (totalMonths - 1) / 12;
        this.month = ((totalMonths - 1) % 12) + 1;

        this.year += yearsToAdd;

    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}

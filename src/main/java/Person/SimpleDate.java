package Person;


public class SimpleDate {
    private int day;
    private int month;
    private int year;

    // Конструктор
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Геттеры
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    // Метод для строкового представления даты
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    // Метод для сравнения дат
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) return true;
        if (this.year > compared.year) return false;
        if (this.month < compared.month) return true;
        if (this.month > compared.month) return false;
        return this.day < compared.day;
    }
}


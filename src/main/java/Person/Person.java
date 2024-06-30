package Person;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    // Конструктор
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
        // Высота и вес инициализируются по умолчанию
    }

    // Геттеры
    public String getName() { return name; }
    public SimpleDate getBirthday() { return birthday; }

    // Метод для сравнения возраста
    public boolean olderThan(Person compared) {
        return this.birthday.before(compared.getBirthday());
    }
}
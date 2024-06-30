package Person;

public class Main {
    public static void main(String[] args) {

        // Создание объектов Person
        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", 1, 1, 780);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        // Сравнение возраста
        if (muhammad.olderThan(pascal)) {
            System.out.println(muhammad.getName() + " старше, чем " + pascal.getName());
        } else {
            System.out.println(muhammad.getName() + " не старше, чем " + pascal.getName());
        }

        // Демонстрация работы SimpleDate
        SimpleDate d1 = new SimpleDate(14, 2, 2011);
        SimpleDate d2 = new SimpleDate(21, 2, 2011);
        System.out.println(d1 + " раньше, чем " + d2 + ": " + d1.before(d2));
    }
}

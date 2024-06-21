import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Добавляем элементы в список
        list.add(15);
        list.add(18);
        list.add(21);
        list.add(24);

        // Удаляем элементы из списка
        list.remove(2); // Удаляет элемент по индексу 2 (21)
        list.remove(Integer.valueOf(15)); // Удаляет первый найденный элемент со значением 15

        // Выводим элементы списка
        System.out.println("Index 0 so the first value: " + list.get(0));
        System.out.println("Index 1 so the second value: " + list.get(1));
    }
}
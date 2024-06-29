package Fitbyte;

public class Program {
    public static void main(String[] args) {
        Fitbyte yura = new Fitbyte(26, 46);
        Fitbyte fatima = new Fitbyte(32, 70);

        HeartRateDisplay.printHeartRateTargets("Yura", yura);
        System.out.println(); // Пустая строка для разделения вывода
        HeartRateDisplay.printHeartRateTargets("Fatima", fatima);
    }
}
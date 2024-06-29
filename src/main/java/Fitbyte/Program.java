package Fitbyte;

public class Program {
    public static void main(String[] args) {
        Fitbyte yura = new Fitbyte(26, 46);
        Fitbyte fatima = new Fitbyte(32, 70);

        printHeartRateTargets("Yura", yura);
        System.out.println(); // Пустая строка для разделения вывода
        printHeartRateTargets("Fatima", fatima);
    }

    private static void printHeartRateTargets(String name, Fitbyte fitbyte) {
        String row = "----------------------------------------------------------------";
        System.out.println("Heart Rate Targets for " + name + ":");
        System.out.println(row);
        System.out.println("| % of Max   | Karvonen Target (bpm) | Zoladz Target (bpm) |");
        System.out.println(row);

        double percentage = 0.5;
        int adjuster = 50;
        while (percentage <= 1.0) {
            double karvonenTarget = fitbyte.targetHeartRateByKarvonen(percentage);
            double zoladzTarget = fitbyte.targetHeartRateByZoladz(adjuster);

            System.out.printf("| %-9s | %.3f                | %.3f - %.3f         |%n",
                    String.format("%.0f%%", percentage * 100),
                    karvonenTarget,
                    zoladzTarget - 5,
                    zoladzTarget + 5);

            if (percentage == 0.9999999) break;
            percentage += 0.1;
            adjuster -= 10;
        }
        System.out.println(row);
    }
}
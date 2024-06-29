package Fitbyte;

public class HeartRateDisplay {
    public static void printHeartRateTargets(String name, Fitbyte fitbyte) {
        System.out.println("Heart Rate Targets for " + name + ":");
        System.out.println("----------------------------------------------------------------");
        System.out.println("| % of Max   | Karvonen Target (bpm) | Zoladz Target (bpm) |");
        System.out.println("----------------------------------------------------------------");

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
            if (percentage >= 0.9999999) break;
            percentage += 0.1;
            adjuster -= 10;
        }
        System.out.println("----------------------------------------------------------------");
    }
}
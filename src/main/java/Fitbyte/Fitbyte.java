package Fitbyte;
public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRateByKarvonen(double percentageOfMaximum) {
//        double maxHeartRate = 220 - this.age; // not so accurate

        double maxHeartRate = 206.3 - (0.711 * this.age); // Tanaki Formula
//        return ((maxHeartRate - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate); // not so clear
        return this.restingHeartRate + (percentageOfMaximum * (maxHeartRate - this.restingHeartRate));

    }
    public double targetHeartRateByZoladz(int adjuster) {
//        double maxHeartRate = 220 - this.age; // not so accurate

        double maxHeartRate = 206.3 - (0.711 * this.age); // Tanaki Formula
//        return ((maxHeartRate - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate); // not so clear
        return maxHeartRate - adjuster;

    }

}

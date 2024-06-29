package Part5_Clock;

public class Main {
    public static void main(String[] args) {
//        ClockHand hours = new ClockHand(24);
//        ClockHand minutes = new ClockHand(60);
//        ClockHand seconds = new ClockHand(60);
//
//        while (true) {
//            // 1. Printing the time
//            System.out.println(hours + ":" + minutes + ":" + seconds);
//
//            // 2. Advancing the second hand
//            seconds.advance();
//
//            // 3. Advancing the other hands when required
//            if (seconds.value() == 0) {
//                minutes.advance();
//
//                if (minutes.value() == 0) {
//                    hours.advance();
//                }
//            }
//        }
        Clock clock = new Clock();
        while (true) {
            System.out.println(clock);
            clock.advance();
        }
    }
}

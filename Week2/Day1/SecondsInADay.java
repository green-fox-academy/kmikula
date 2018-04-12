public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int endOfDay = 24 * 60 * 60;

        int currentTime = currentHours * currentMinutes * currentSeconds;

        int remainingSeconds = endOfDay - currentTime;

        System.out.println(remainingSeconds + " seconds remained of the day.");

    }
}

import java.util.Scanner;

public class mileToKmConverter {

    public static void main (String []args) {

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);
        int distanceInKm = scanner.nextInt();
        float milesPerKm = (float) 0.621371192;
        float convertedToMiles = distanceInKm * milesPerKm;

        System.out.println(distanceInKm + " kilometers are " + convertedToMiles + " miles.");


    }
}

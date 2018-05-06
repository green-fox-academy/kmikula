public class Station {

    int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        System.out.println("Gas volume at the station is: " + (this.gasAmount -= car.capacity));
        System.out.println("Gas value in the tank of the car is: " + (car.gasAmount += car.capacity));

    }
}

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(String type) {
        this.nrOfPlaces = 4;
        this.colour = "white";
        this.kmPerHour = 400;
        this.placeOfUsage = "air";
        this.type = type;

    }

    @Override
    public String land() {
        return "on a landing pad on the roof";
    }

    @Override
    public String fly() {
        return "with rotors";
    }

    @Override
    public String takeOff() {
        return "soring 90°vertically and then flies away";

    }

    @Override
    public String toString() {
        return "Helicopter{ of type " + type + ", " +
                "number Of Places:" + nrOfPlaces +
                ", kmPerHour:" + kmPerHour +
                ", place Of Usage:'" + placeOfUsage + '\'' +
                ", colour:'" + colour + '\'' +
                '}';
    }
}

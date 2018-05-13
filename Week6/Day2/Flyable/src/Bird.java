public class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
        this.nrOfLegs = 2;
        this.livingPlace = "on the land, on the shore or on the trees";
        this.typeOfOutfit = "feather";
    }

    public String sing() {
        return "chirp";
    }

    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public String move() {
        return "flying";
    }

    @Override
    public String land() {
        return "on a tree or a bush";
    }

    @Override
    public String fly() {
        return "with wings";
    }

    @Override
    public String takeOff() {
        return "spreading wings";
    }
}

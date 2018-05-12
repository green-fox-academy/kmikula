package animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
        this.nrOfLegs = 2;
        this.livingPlace = "on the land, on the shore or on the trees";
        this.typeOfOutfit = "feather";
    }

    public String sing(){
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
}

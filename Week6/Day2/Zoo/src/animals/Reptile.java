package animals;

public class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
        this.nrOfLegs = 4;
        this.livingPlace = "on land and in the water";
        this.typeOfOutfit = "skin with scales";
    }

    public void catchFlyes(){
        System.out.println("Reptiles can catch files and eat them instantly.");
    }


    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public String move() {
        return "crawling and swimming";
    }
}

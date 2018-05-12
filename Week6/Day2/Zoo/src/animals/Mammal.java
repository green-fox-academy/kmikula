package animals;

public class Mammal extends Animal {

    boolean isCarnivore;

    public Mammal(String name) {
        super(name);
        this.nrOfLegs = 4;
        this.livingPlace = "on land";
        this.typeOfOutfit = "fur or skin";

    }

    boolean getCarnivores(String plantOrAnimal){
        if(plantOrAnimal == "plant"){
            return(!isCarnivore);
        }else {
            return (isCarnivore);
        }
    }


    @Override
    public String breed() {
        return "pushing miniature versions out";
    }

    @Override
    public String move() {
        return "walking";
    }
}

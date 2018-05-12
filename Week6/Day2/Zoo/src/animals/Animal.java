package animals;

public abstract class Animal {

    String name;
    int age;
    int nrOfLegs;
    String livingPlace;
    String typeOfOutfit;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getTypeOfOutfit(){
        return this.typeOfOutfit;
    }

    public abstract String breed();

    public abstract String move();


}

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Tom");
        Animal dog = new Animal("Buddy");
        Animal hedgehog = new Animal("Hawkins");
        Animal cow = new Animal("Stanley");

        hedgehog.eat();
        dog.drink();
        cat.play();

        Farm farm = new Farm(5);
        farm.animals.add(cat);
        farm.animals.add(dog);
        farm.animals.add(hedgehog);

        farm.breed(cow);
        farm.slaughter(farm.animals);
    }
}

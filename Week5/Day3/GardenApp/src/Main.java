public class Main {

    public static void main(String[] args) {


        Plant flower1 = new Flower("yellow", 0);
        Plant flower2 = new Flower("blue", 0);

        Plant tree1 = new Tree("purple", 0);
        Plant tree2 = new Tree("orange", 0);

        Garden garden = new Garden();

        garden.plants.add(flower1);
        garden.plants.add(flower2);
        garden.plants.add(tree1);
        garden.plants.add(tree2);

        garden.gardenStatus();
        garden.gardenWatering(40);
        garden.gardenStatus();
        garden.gardenWatering(70);
        garden.gardenStatus();
    }
}

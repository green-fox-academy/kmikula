import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> animals;
    int slot;

    public Farm(int slot) {
        this.animals = new ArrayList<>();
        this.slot = slot;
    }

    public void breed(Animal animal) {
        if (slot > animals.size()) {
            animals.add(animal);
            System.out.println(animal.name + " was added to the farm.");
        } else {
            System.out.println(animal.name + " could not be added to the farm because there is no more place.");
        }
    }

    public void slaughter(ArrayList animals) {
        int min = 0;

        for (int i = 0; i < animals.size(); i++) {
            //System.out.println(((Animal) animals.get(i)).hunger);

            if (((Animal) animals.get(i)).hunger < ((Animal) animals.get(min)).hunger) {

                min = i;
            }
        }

        System.out.println((((Animal) (animals.get(min))).name) + " was removed from the farm.");
        animals.remove(min);
    }
}

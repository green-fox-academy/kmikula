import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> plants;

//    public Garden() {
//        this.plants = new ArrayList<>();
//    }

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public Garden(ArrayList<Plant> plants) {
        this.plants = plants;
    }

    public void add(Plant plant) {
        this.plants.add(plant);
    }

    public void gardenWatering(double waterVolume) {

        ArrayList<Plant> plantsToBeWatered = new ArrayList<>();

        for (int i = 0; i < plants.size(); i++) {

            if (plants.get(i).needsWater() == true) {

                plantsToBeWatered.add(plants.get(i));
            }

        }

        for (int i = 0; i < plantsToBeWatered.size(); i++) {
            plantsToBeWatered.get(i).watering((waterVolume / plantsToBeWatered.size()));
        }

    }

    public void gardenStatus() {
        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).status();
        }

    }
}


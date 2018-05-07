public class Plant {

    String color;
    double waterLevel;
    double absorbtion;

    public Plant() {
        this.color = "green";
        this.waterLevel = 0;
    }

    public Plant(String color, double waterLevel) {
        this.color = color;
        this.waterLevel = waterLevel;
    }

    public void status() {
        if (waterLevel == 0) {
            System.out.println("The " + this.color + " plant needs water.");
        } else {
            System.out.println("The " + this.color + " plant doesn't need water.");
        }
    }

    public boolean needsWater() {
        return (waterLevel < 0);
    }

    public double watering(double waterVolume) {
        waterLevel += waterVolume * absorbtion;

        return waterLevel;
    }
}

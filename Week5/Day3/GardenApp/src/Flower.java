public class Flower extends Plant {

    public Flower(String color, double waterLevel) {
        super(color, waterLevel);
        this.absorbtion = 0.75;
    }

    public void status() {
        if (waterLevel < 5) {
            System.out.println("The " + this.color + " flower needs water.");
        } else {
            System.out.println("The " + this.color + " flower doesn't need water.");
        }
    }

    public boolean needsWater() {
        return (waterLevel < 5);
    }

}

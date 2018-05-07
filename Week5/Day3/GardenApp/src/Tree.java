public class Tree extends Plant {

    public Tree(String color, double waterLevel) {
        super(color, waterLevel);
        this.absorbtion = 0.4;
    }

    public void status() {
        if (waterLevel < 10) {
            System.out.println("The " + this.color + " tree needs water.");
        } else {
            System.out.println("The " + this.color + " tree doesn't need water.");
        }
    }

    public boolean needsWater() {
        return (waterLevel < 10);
    }
}

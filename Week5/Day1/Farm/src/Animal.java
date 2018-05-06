public class Animal {

    // static int hungerCounter = 50;
    //static int thirstCounter = 50;
    int hunger;
    int thirst;

    String name;

    public Animal(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        this.hunger--;
        System.out.println(hunger);

    }

    public void drink() {
        this.thirst--;
        System.out.println(thirst);
    }

    public void play() {
        this.hunger++;
        this.thirst++;

        System.out.println(hunger);
        System.out.println(thirst);

    }
}

public class Animal {

    static int hungerCounter = 50;
    static int thirstCounter = 50;
    int hunger;
    int thirst;

    String name;

    public void eat() {
        this.hunger = --hungerCounter;
        System.out.println(hunger);

    }

    public void drink() {
        this.thirst = --thirstCounter;
        System.out.println(thirst);
    }

    public void play() {
        this.hunger = ++hungerCounter;
        this.thirst = ++thirstCounter;

        System.out.println(hunger);
        System.out.println(thirst);

    }
}

package main.java.music;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;

    abstract String sound();

    public void play() {
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" " + this.numberOfStrings + "-stringed instrument that goes " + this.sound();
    }
}

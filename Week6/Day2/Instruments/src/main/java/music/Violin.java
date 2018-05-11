package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        this.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    String sound() {
        return "Screech";

    }


}

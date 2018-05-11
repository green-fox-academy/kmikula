package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.numberOfStrings = 4;
    }

    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    String sound() {
        return "Duum-duum-duum";

    }


}

package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.numberOfStrings = 6;

    }

    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    String sound() {
        return "Twang";
    }


}

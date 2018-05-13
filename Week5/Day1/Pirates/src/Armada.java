import java.util.ArrayList;

public class Armada {
    ArrayList<Ship> armada;

    public Armada() {

        this.armada = new ArrayList<>();
    }

    public void fillArmada() {
        int armadaSize = (int) (Math.random() * 6) + 1;
        for (int i = 1; i < armadaSize; i++) {
            armada.add(new Ship());
        }
        for (int i = 0; i < armada.size(); i++) {
            armada.get(i).fillShip();
            armada.get(i).drinkAll();
        }
    }

    public void getArmadaStatus() {
        System.out.println("Armada has " + this.armada.size() + " ships.");
        for (int i = 0; i < armada.size(); i++) {
            if (armada.size() > 0) {
                armada.get(i).status();
            }
        }
    }

    public boolean war(Armada otherArmada) {

        while (this.armada.size() > 0 && otherArmada.armada.size() > 0) {

            for (int i = 0; i < this.armada.size(); i++) {
                if (this.armada.size() > i && otherArmada.armada.size() > i) {

                    if (this.armada.get(i).battle(otherArmada.armada.get(i)) == true) {
                        this.armada.get(i).afterTheBattle(otherArmada.armada.get(i));
                        otherArmada.armada.remove(i);
                    } else if (this.armada.get(i).battle(otherArmada.armada.get(i)) == false) {
                        this.armada.get(i).afterTheBattle(otherArmada.armada.get(i));
                        this.armada.remove(i);
                    }

                } else {
                    break;
                }
            }
        }

        return (this.armada.size() > otherArmada.armada.size());
    }
}

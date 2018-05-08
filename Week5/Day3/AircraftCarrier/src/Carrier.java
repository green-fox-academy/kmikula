import java.util.ArrayList;

public class Carrier {

    int initialAmmo;
    int healthPoint;
    ArrayList<Aircraft> aircrafts;
    int fightDamage;

    public Carrier(ArrayList<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public Carrier(int initialAmmo, int healthPoint) {
        this.initialAmmo = initialAmmo;
        this.healthPoint = healthPoint;
        this.aircrafts = new ArrayList<>();
        this.fightDamage = 0;
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fillAll() {
        int aircraftsAmmo = 0;
        for (int i = 0; i < aircrafts.size(); i++) {
            aircraftsAmmo += aircrafts.get(i).getAmmoToFill();
        }

        if (initialAmmo == 0) {
            System.out.println("There is no ammo in the storage");

        } else if (aircraftsAmmo <= initialAmmo) {
            for (int i = 0; i < aircrafts.size(); i++) {

                this.initialAmmo = aircrafts.get(i).refill(initialAmmo);
            }


        } else {
            for (int i = 0; i < aircrafts.size(); i++) {

                if (initialAmmo > 0 && aircrafts.get(i).isPriority()) {
                    this.initialAmmo = aircrafts.get(i).refill(initialAmmo);
                }
            }

            if (initialAmmo > 0 ) {
                for (int i = 0; i <aircrafts.size() ; i++) {
                    this.initialAmmo = aircrafts.get(i).refill(initialAmmo);
                }
            } else {
                System.out.println("There is no ammo left in the storage");
            }

        }

    }



    public int fight(Carrier carrierEnemy) {


        for (int i = 0; i < aircrafts.size(); i++) {
            int aircraftDamage = aircrafts.get(i).fight();
            carrierEnemy.healthPoint -= aircraftDamage;
            carrierEnemy.fightDamage += aircraftDamage;

            if (carrierEnemy.healthPoint <= 0) {
                carrierEnemy.healthPoint = 0;
                System.out.println("It's dead Jim :(");
            }
        }
        return fightDamage;
    }

    public void getStatus() {

        System.out.println("HP: " + healthPoint + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + initialAmmo + ", Total damage: " + fightDamage + "\n")
        ;
        System.out.println("Aircrafts:");


        for (int i = 0; i < aircrafts.size(); i++) {

            aircrafts.get(i).getStatus();
        }

        System.out.println();
    }

}

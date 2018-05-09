import java.util.ArrayList;

public class Ship {

    ArrayList<Pirates> crew;
    Pirates captain;

    public Ship() {
        this.crew = new ArrayList<>();
        this.captain = new Pirates();
    }

    public void fillShip() {
        crew.add(captain);
        int crewSize = (int) (Math.random() * 15) + 1;
        for (int i = 1; i < crewSize; i++) {
            crew.add(new Pirates());
        }

    }

    public void drinkAll() {
        for (int i = 0; i < crew.size(); i++) {
            crew.get(i).drinkSomeRum();
        }
    }

    public int getNrOfPiratesAlive() {
        int nrOfPiratesAlive = 0;
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).life == "alive") {
                nrOfPiratesAlive++;
            }
        }
        return nrOfPiratesAlive;
    }

    public void status() {
        System.out.println("Captain is " + captain.life + ", consumed rum: " + captain.nrOfRum + ", nr of pirates alive in the crew: " + getNrOfPiratesAlive());
    }

    public int getScore() {

        int score = getNrOfPiratesAlive() - captain.nrOfRum;
        return score;
    }

    public boolean battle(Ship othership) {

        return (this.getScore() > othership.getScore());
    }

    public void afterTheBattle(Ship othership) {

        int rate = (int) (Math.random() * 5) + 1;
        if (this.battle(othership)) {

            for (int i = 0; i < this.crew.size(); i++) {
                this.crew.get(i).nrOfRum += rate;
            }
            for (int i = 1; i < othership.crew.size(); i++) {
                if (i % rate == 0) {
                    othership.crew.get(i).die();
                }
            }

        } else {

            for (int i = 0; i < othership.crew.size(); i++) {
                othership.crew.get(i).nrOfRum += rate;
            }
            for (int i = 0; i < this.crew.size(); i++) {
                if (i % rate == 0) {
                    this.crew.get(i).die();
                }
            }

        }
    }


}
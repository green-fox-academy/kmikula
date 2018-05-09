public class Pirates {

    int nrOfRum;
    String life;

    public Pirates() {
        this.nrOfRum = 0;
        this.life = "alive";
    }

    public int drinkSomeRum() {
        if (this.life == "alive") {
            int shots = (int) (Math.random() * 5) + 1;
            this.nrOfRum += shots;
        } else {
            System.out.println("He is dead.");
        }
        return nrOfRum;
    }

    public void howsItGoingMate() {
        if (this.life == "alive") {
            if (nrOfRum < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
        } else {
            System.out.println("He is dead.");
        }
    }

    public String die() {
        this.life = "dead";
        return life;
    }

    public void brawl(Pirates otherPirate) {
        int random = (int) (Math.random() * 3) + 1;
        if (random == 1) {
            this.life = "dead";
        } else if (random == 2) {
            otherPirate.life = "dead";
        } else {
            this.life = "dead";
            otherPirate.life = "dead";
        }

    }

}

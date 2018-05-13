public class BattleApp {
    public static void main(String[] args) {
     /*   Ship blackPearl = new Ship();
        Ship jollyRoger = new Ship();

        blackPearl.fillShip();
        jollyRoger.fillShip();

        blackPearl.drinkAll();
        jollyRoger.drinkAll();

        blackPearl.status();
        jollyRoger.status();

        try {
            blackPearl.crew.get(2).brawl(jollyRoger.crew.get(2));
        } catch (Exception e) {
            System.out.println("One of these fellows are not part of the crew.");
        }

        try {
            jollyRoger.crew.get(3).howsItGoingMate();
        } catch (Exception e) {
            System.out.println("This fellow is not in the crew.");
        }

        blackPearl.status();
        jollyRoger.status();


        blackPearl.afterTheBattle(jollyRoger);

        blackPearl.status();
        jollyRoger.status();
        System.out.println("------------------");   */

        Armada sparrowsArmada = new Armada();
        Armada barbossasArmada = new Armada();

        sparrowsArmada.fillArmada();
        barbossasArmada.fillArmada();

        sparrowsArmada.getArmadaStatus();
        barbossasArmada.getArmadaStatus();

        sparrowsArmada.war(barbossasArmada);

        sparrowsArmada.getArmadaStatus();
        barbossasArmada.getArmadaStatus();

    }
}

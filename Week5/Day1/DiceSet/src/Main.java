public class Main {

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();

//        diceSet.getCurrent();
//        diceSet.roll();
//        diceSet.getCurrent();
//        diceSet.getCurrent(5);
//        diceSet.reroll();
//        diceSet.getCurrent();
//        diceSet.reroll(4);
//        diceSet.getCurrent();

        diceSet.roll();
        allSix(diceSet);
    }

    public static void allSix(DiceSet diceSet) {

        int[] currents = diceSet.getCurrent();

        for (int i = 0; i < currents.length; i++) {
            if (currents[i] == 6) {
                System.out.println(currents[i]);
            } else {
                while (currents[i] != 6) {
                    diceSet.reroll(i);
                    diceSet.getCurrent(i);
                }
                System.out.println(currents[i]);
            }

        }

    }

}


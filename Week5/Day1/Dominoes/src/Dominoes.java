import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        ArrayList<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        //System.out.println(dominoes);
        System.out.println(sortDominoes(dominoes));
    }

    static ArrayList<Domino> initializeDominoes() {
        ArrayList<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    public static List<Domino> sortDominoes(List<Domino> dominoes) {


        ArrayList<Domino> sortedDominos = new ArrayList<>();
        int firstDominoNr2 = 0;
        int secondDominoNr1 = 0;
        int index = 0;


        firstDominoNr2 = dominoes.get(0).getValues()[1];
        sortedDominos.add(index, dominoes.get(0));
        index++;


        for (int i = 1; i < dominoes.size(); i++) {

            for (int j = dominoes.size() - 1; j > 0; j--) {

                secondDominoNr1 = dominoes.get(j).getValues()[0];

                if (firstDominoNr2 == secondDominoNr1) {

                    sortedDominos.add(index, dominoes.get(j));

                    ++index;

                    firstDominoNr2 = dominoes.get(j).getValues()[1];
                }

            }

        }

        return sortedDominos;
    }

}







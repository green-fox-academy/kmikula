public class DiagonalMatrix {

    public static void main(String[] args) {

        int row, col;

        String[][] diagonal = new String[5][5];


        for (row = 1; row < 5; row++) {
            for (col = 1; col < 5; col++) {
                if (col == row) {
                    diagonal[row][col] = "1";

                    System.out.print(diagonal[row][col]);

                } else {
                    diagonal[row][col] = "0";

                    System.out.print(diagonal[row][col]);
                }
            }

            System.out.println(" ");
        }
    }
}


// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

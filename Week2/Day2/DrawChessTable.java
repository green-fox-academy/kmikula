public class DrawChessTable {

    public static void main(String []args){

        // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
        for(int i=0; i<8; i++){
            if(i % 2 ==0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("%");
                    for (int k = 0; k < 1; k++) {
                        System.out.print("/");
                    }
                }
            }else {
                for (int j = 0; j < 4; j++) {
                    System.out.print("/");
                    for (int k = 0; k < 1; k++) {
                        System.out.print("%");
                    }
                }


            }
            System.out.println("/");

        }

    }

}


 /*for(int i=0; i<8; i++){
        for(int j=0; j<4; j++){
        System.out.print("%");
        for(int k=0; k<1; k++){
        System.out.print("/");
        }
        }


        System.out.println("/");

        }

        }

        }*/
import java.util.ArrayList;


public class CandyShop {

    static ArrayList<Object> arrayList = new ArrayList<Object>();


    public static void main(String[] args) {

        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));

    }
    public static ArrayList<Object> sweets(ArrayList<Object> arrayList) {



        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) instanceof Boolean) {

                arrayList.set(i, "Ice Cream");


            } else if (arrayList.get(i) instanceof Integer) {

                arrayList.set(i, "Croissant");
            }


        }

        return arrayList;
    }


}
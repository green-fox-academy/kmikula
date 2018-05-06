import java.util.ArrayList;

public class SharpieSet {

    static ArrayList<Sharpie> sharpies;


    public SharpieSet() {
        this.sharpies = new ArrayList<>();

    }

    public int countUsable(ArrayList sharpieSet) {
        int count = 0;

        for (int i = 0; i < sharpieSet.size(); i++) {
            if (((Sharpie) sharpieSet.get(i)).inkAmount > 0) {
                count++;
            }
        }
        return count;
    }

    public void removeTrash(ArrayList sharpieSet) {
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (((Sharpie) sharpieSet.get(i)).inkAmount <= 0) {
                sharpieSet.remove(i);
            }
        }

    }

    public void listUsable(ArrayList sharpieSet) {

        for (int i = 0; i < sharpieSet.size(); i++) {
            Sharpie tempSharpie = (Sharpie) sharpieSet.get(i);
            System.out.println(tempSharpie.color);
        }

    }

}

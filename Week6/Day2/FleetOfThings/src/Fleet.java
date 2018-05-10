import java.util.ArrayList;

public class Fleet {

    private ArrayList<Thing> things;

    public Fleet() {
        things = new ArrayList<>();
    }

    public void add(Thing thing) {
        things.add(thing);
    }

    public ArrayList<Thing> getThings() {
        return things;
    }

    public void setThings(ArrayList<Thing> things) {
        this.things = things;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < things.size(); i++) {
            result += (i + 1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}

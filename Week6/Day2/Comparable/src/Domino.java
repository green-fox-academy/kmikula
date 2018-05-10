public class Domino implements Comparable<Domino> {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }


    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino o) {
        //return toString().compareTo(o.toString());

        int[] firstValue = this.values;
        int[] secondValue = o.values;
        int compareValue = 0;

        if (firstValue[0] == secondValue[0]) {
            compareValue = firstValue[1] - secondValue[1];
        } else {
            compareValue = firstValue[0] - secondValue[0];
        }

        return compareValue;
    }

}





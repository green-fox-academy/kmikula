public class Shifter implements CharSequence{

    String text;
    int shiftIndex;

    public Shifter(String text, int shiftIndex) {
        this.text = text;
        this.shiftIndex = shiftIndex;
    }

    @Override
    public int length() {
        return this.text.length();
    }

    @Override
    public char charAt(int index) {
        return this.text.charAt(index+shiftIndex);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.text.subSequence(start+shiftIndex, end+shiftIndex);
    }

    @Override
    public String toString() {
        return "Shifter{" +
                "text='" + text + '\'' +
                ", shiftIndex=" + shiftIndex +
                '}';
    }
}

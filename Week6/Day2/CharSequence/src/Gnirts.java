public class Gnirts implements CharSequence {

    String text;

    public Gnirts(String text) {
        this.text = text;
    }

    @Override
    public int length() {
        return this.text.length();
    }

    @Override
    public char charAt(int index) {
        int revIndex = this.text.length() - 1 - index;
        return this.text.charAt(revIndex);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder(this.text);
        sb.reverse();
        return sb.toString().subSequence(start, end);

    }

    @Override
    public String toString() {
        return "Gnirts{" +
                "text='" + text + '\'' +
                '}';
    }
}

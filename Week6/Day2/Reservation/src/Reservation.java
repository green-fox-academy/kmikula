import java.text.DateFormatSymbols;
import java.util.ArrayList;

public class Reservation implements Reservations {

    String[] dowArray = new String[7];

    String resCode = "";

    public Reservation() {

    }


    @Override
    public String getDowBooking() {
        DateFormatSymbols dfs = new DateFormatSymbols();
        dowArray = dfs.getShortWeekdays();

        int dow = (int) (Math.random() * 7) + 1;
        return dowArray[dow].toUpperCase();
    }

    @Override
    public String getCodeBooking() {
        ArrayList<Character> chars = new ArrayList<>();
        for (char ch = '0'; ch < '9'; ++ch) {
            chars.add(ch);
        }
        for (char ch = 'A'; ch < 'Z'; ++ch) {
            chars.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * chars.size()) + 0;
            sb.append(chars.get(index));

            //int asciiIndex = (int) (Math.random() * 42) + 48;
            //sb.append(Character.toChars(asciiIndex));
        }
        resCode = sb.toString();

        return resCode;
    }

    @Override
    public String toString() {
        return "Booking# " +
                this.getCodeBooking() +
                " for " + this.getDowBooking();
    }
}


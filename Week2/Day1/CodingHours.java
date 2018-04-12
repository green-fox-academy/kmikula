public class CodingHours {

    public static void main (String[] args) {

        int averageHourPerAttendee = 6;
        int weekPerSemester = 17;
        int nrOfWorkDay = 5;

        int avgWorkhourPerWeek = 52;

        int hoursPerSem = averageHourPerAttendee * nrOfWorkDay * weekPerSemester;
        int avgWorkHourPerSem = avgWorkhourPerWeek * weekPerSemester;

        float percentOfWorkHours = (float) (hoursPerSem *100 / avgWorkHourPerSem );

        System.out.println(hoursPerSem);

        System.out.println(percentOfWorkHours + "%" );

    }
}

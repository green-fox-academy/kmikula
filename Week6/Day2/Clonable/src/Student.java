public class Student extends Person implements Cloneable {

    String previousOrganization;
    int skippedDays;
    int numberOfDays;




    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + "," + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public int skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
        return skippedDays;
    }

    @Override
    public Student clone() {
        return new Student("John", 20, "male", "BME");
    }
}

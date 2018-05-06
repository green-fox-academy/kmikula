public class Teachers {

    String name;
    String subject;

    public Teachers(String name) {
        this.name = name;
    }

    public void teach(Students student) {
        student.learn();
    }

    public void answer() {
        System.out.println("Try to look at it in another way.");

    }
}

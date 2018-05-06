public class Students {

    String name;

    public Students(String name) {
        this.name = name;
    }

    public void learn() {
        System.out.println("I learn Maths.");
    }

    public void question(Teachers teacher) {
        teacher.answer();
    }
}

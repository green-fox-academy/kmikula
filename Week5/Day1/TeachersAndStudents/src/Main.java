public class Main {

    public static void main(String[] args) {
        Students student = new Students("Andie");
        Teachers teacher = new Teachers("Mr.Anderson");

        teacher.teach(student);
        student.question(teacher);
    }
}

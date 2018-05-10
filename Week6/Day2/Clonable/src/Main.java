public class Main{

    public static void main(String[] args) {

        Student student = new Student();

        Student student2 = student.clone();

        System.out.println("First student's name is: "+student.name + " , second student's name is: " + student2.name);

        student2.introduce();
    }

}

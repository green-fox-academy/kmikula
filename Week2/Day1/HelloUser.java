import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
    }
}

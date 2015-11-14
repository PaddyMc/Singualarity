package testMediaDevice;

import java.util.Scanner;

public class LoginCLI {
    static Scanner scanner = new Scanner(System.in);

    public static String requestUserName() {
        System.out.print("Enter your user name: ");
        return scanner.next();
    }

    public static int requestPassword() {
        System.out.print("Enter your pin number: ");
        return scanner.nextInt();
    }
}

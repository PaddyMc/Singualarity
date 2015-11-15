package testMediaDevice;

import java.util.Scanner;

public class CommanderCLI {
    static Scanner scanner = new Scanner(System.in);

    public static String getInput() {
        System.out.println("Enter your command: ");
        return scanner.next();
    }
}

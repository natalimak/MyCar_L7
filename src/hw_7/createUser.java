package hw_7;

import java.io.IOException;
import java.util.Scanner;

public class createUser {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        writeToLog WriteToLog1 = writeToLog.getInstance();
        writeToLog WriteToLog2 = writeToLog.getInstance();
        WriteToLog1.WriteUserToFile(input);


        System.out.println("Please enter your age");
        Integer age = scanner.nextInt();
        String s=String.valueOf(age);
        // writeToLog WriteToLog2 = writeToLog.getInstance();
        WriteToLog2.WriteUserToFile(s);
    }
}

import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
       // This program demonstrates the use of the Scanner class to read user input in Java.

        // Creating a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for input
        System.out.println("Enter a number:");

        // Reading an integer from the user
        int number = scanner.nextInt();

        // Displaying the entered number
        System.out.println("You entered: " + number);

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
    
}

import java.util.Scanner;
public class forifloop {
    public static void main(String[] args) {
        // This program demonstrates the use of a for loop and an if statement to print even numbers from 0 to 20.
        
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user for input
        System.out.println("Enter a number:");
        
        // Reading an integer from the user
        int n = scanner.nextInt();
        
        // Using a for loop to iterate from 0 to n
        for (int i = 0; i <= n; i++) {
            // Using an if statement to check if the number is even
            if (n < 1) {
                System.out.println(i + " is less than 10.");
            }else {
                System.out.println(i + " is greater than or equal to 10.");
            }
        }
        
        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}

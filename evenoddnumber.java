import java.util.Scanner;
public class evenoddnumber {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); 
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        scanner.close();
    }
}
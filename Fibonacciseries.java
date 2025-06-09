public class Fibonacciseries {
    public static void main(String[] args) {
        int n = 10; // Length of the Fibonacci series
        int a = 0, b = 1; // Starting values

        System.out.print("Fibonacci Series: " + a + ", " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b; // Next number in the series
            System.out.print(", " + c);
            a = b; // Update a to the next number
            b = c; // Update b to the next number
        }
    }                                                                                           
}

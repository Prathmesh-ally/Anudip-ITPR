public class compiletimepolymorphism {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Sum of two integers: " + add(a, b));
        
        double x = 5.5, y = 10.5;
        System.out.println("Sum of two doubles: " + add(x, y));
        
        String str1 = "Hello, ", str2 = "World!";
        System.out.println("Concatenation of two strings: " + add(str1, str2));
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public static String add(String a, String b) {
        return a + b;
    }
    
}

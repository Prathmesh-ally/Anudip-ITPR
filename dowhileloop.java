public class dowhileloop {
    public static void main (String [] args){
        int n  = 0; // Initialize n
        do {
            System.out.println(n);
            n++; // Increment n to avoid infinite loop
        }while (n < 10); // Continue while n is less than 10
    }
    
}
// This code demonstrates a do-while loop that prints numbers from 0 to 9.
// The loop will execute at least once, even if the condition is false initially.
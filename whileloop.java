public class whileloop {
    public static void main (String[] args){
        int n=0 ;
        while (n < 10) {
            System.out.println(n);
            n++; // Increment n to avoid infinite loop
            n = n + 2; // Increment n by 2 to print odd numbers only
            n = n + 1; // Increment n by 1 to print even numbers only
            n = n - 1 ;
        }
    }
    
}

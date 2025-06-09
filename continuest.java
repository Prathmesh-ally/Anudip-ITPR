public class continuest {
    public static void main (String [] args){
        for (int i = 0 ; i<10 ; i++){
            if (i == 5){
                continue; // Skip the rest of the loop when i is 5
            }
            System.out.println("Current value of i: " + i);
        }
    }
}
//if condition nopt given, it will print all values of i from 0 to 9 
// Output will be:
// Current value of i: 0            
// Current value of i: 1
// Current value of i: 2
// Current value of i: 3
// Current value of i: 4

// Current value of i: 6                
// Current value of i: 7    
// Current value of i: 8    
// Current value of i: 9
// The loop skips the iteration when i is 5, so it does not print "Current value of i: 5".
// The continue statement causes the loop to skip the current iteration and move to the next one, effectively ignoring the value 5 in this case.    

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Read the double value from input
        double d = sc.nextDouble();
        
        // Typecast double to int using (int)
        // This truncates the decimal part (e.g., 10.23 becomes 10)
        int result = (int) d;
        
        // Print the integer value
        System.out.println(result);
    }
}
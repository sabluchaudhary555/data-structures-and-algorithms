import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1. Store value of 'a' in a temporary variable
        int temp = a;
        
        // 2. Assign value of 'b' to 'a'
        a = b;
        
        // 3. Assign value of 'temp' (original 'a') to 'b'
        b = temp;

        System.out.println(a + " " + b);
    }
}
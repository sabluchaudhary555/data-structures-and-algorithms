// Complete the function
// Take input for a and s
import java.util.Scanner;

class Geeks {
    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Taking the number of testcases
        while (t-- > 0) {
            // Read integer input
            int a = sc.nextInt();
            
            // Clear the buffer after reading integer
            sc.nextLine();
            
            // Read the entire string line (including spaces)
            String s = sc.nextLine();

            // Your code here
            // No additional code needed as we just need to print a and s

            System.out.println(a);
            System.out.println(s);
        }
        sc.close();
    }
}
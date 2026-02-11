import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        
        // 1. Convert the String to an integer
        int value = Integer.parseInt(num);
        
        // 2. Double the integer value and print it
        System.out.println(value * 2);
    }
}
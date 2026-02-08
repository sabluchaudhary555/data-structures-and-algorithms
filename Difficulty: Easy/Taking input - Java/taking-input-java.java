import java.util.*;

class GFG {
    public static void main(String args[]) {
        // Implement Scanner Class
        Scanner sc = new Scanner(System.in);
        
        // Take all inputs
        int a = sc.nextInt();      // reads integer
        float b = sc.nextFloat();  // reads float
        long c = sc.nextLong();    // reads long
        byte d = sc.nextByte();    // reads byte
        
        // Handle newline issue before reading string
        sc.nextLine(); 
        
        String s = sc.nextLine();  // reads the full string
        
        // Print all the values
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        
        sc.close();
    }
}
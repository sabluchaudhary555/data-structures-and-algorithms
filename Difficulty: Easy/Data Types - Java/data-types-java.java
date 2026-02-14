class Geeks {
    static void dataTypes(int a, float b, double c, long l, byte d) {
        // 1. Divide c by b
        double p = c / b; 
        
        // 2. Divide b by a
        double q = b / a; 
        
        // 3. Divide c by a
        double r = c / a; 
        
        // 4. Add the result of step 3 with l
        double m = r + l; 
        
        // 5. Divide a by d (Integer division)
        int s = a / d; 

        // Print all results separated by a space
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
    }
}
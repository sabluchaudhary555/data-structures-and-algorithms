class Solution {
    public static String compareNM(int n, int m) {
        // Check if n is less than m
        if (n < m) {
            return "lesser";
        } 
        // Check if n is equal to m
        else if (n == m) {
            return "equal";
        } 
        // If neither, n must be greater than m
        else {
            return "greater";
        }
    }
}
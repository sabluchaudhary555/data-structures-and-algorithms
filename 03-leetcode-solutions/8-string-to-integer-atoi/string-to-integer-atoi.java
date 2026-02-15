class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int index = 0;
        int n = s.length();
        
        // 1. Skip leading whitespace
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        
        // If we've reached the end of string
        if (index >= n) {
            return 0;
        }
        
        // 2. Handle sign
        int sign = 1;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
        
        // 3. Convert number
        long result = 0;
        while (index < n) {
            char c = s.charAt(index);
            
            // Stop if non-digit character is encountered
            if (c < '0' || c > '9') {
                break;
            }
            
            // Build the number
            result = result * 10 + (c - '0');
            
            // 4. Handle overflow/underflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            index++;
        }
        
        // Apply sign and return
        return (int)(sign * result);
    }
}
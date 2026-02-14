class Solution {
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            // Add the last digit of x to the reversed number
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }
        
        // Handle 32-bit signed integer overflow
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
}
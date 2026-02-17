class Solution {
    public int countDigits(int n) {
        // code here
        int count = 0;
        
        // Keep dividing by 10 until n becomes 0
        while (n > 0) {
            count++;
            n = n / 10;
        }
        
        return count;
    }
}
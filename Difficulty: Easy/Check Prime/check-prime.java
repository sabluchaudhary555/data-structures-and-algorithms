class Solution {
    public static boolean prime(int n) {
        // 1. Numbers less than or equal to 1 are not prime
        if (n <= 1) return false;

        // 2. Check for divisors from 2 up to the square root of n
        // Optimization: A number n doesn't have factors larger than sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }

        // 3. No divisors found, it is prime
        return true;
    }
}
class Solution {
    public static void printPrimeFactorization(int n) {
        // code here
        // Start with 2 (smallest prime)
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        
        // Check odd numbers starting from 3
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        
        // If n is still greater than 2, then it's a prime factor
        if (n > 2) {
            System.out.print(n + " ");
        }
    }
}
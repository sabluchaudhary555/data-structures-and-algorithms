class Solution {
    public int[] computeOperations(int x, int y) {
        // 1. Addition
        int p = x + y;
        // 2. Subtraction
        int q = x - y;
        // 3. Multiplication
        int r = x * y;
        // 4. Division
        int s = x / y;
        // 5. Modulo (Remainder)
        int t = x % y;

        // Return all results in the required array format
        return new int[]{p, q, r, s, t};
    }
}
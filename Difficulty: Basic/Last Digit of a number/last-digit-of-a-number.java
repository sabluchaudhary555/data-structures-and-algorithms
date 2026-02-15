class Solution {
    public static void utility(int n) {

        // Get the last digit and ensure it's positive
        int ans = Math.abs(n) % 10;

        // below statement print the result
        System.out.println(ans);
    }
}
class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int lessEqual = 0;
        int greaterEqual = 0;
        
        for (int num : arr) {
            if (num <= target) {
                lessEqual++;
            }
            if (num >= target) {
                greaterEqual++;
            }
        }
        
        return new int[]{lessEqual, greaterEqual};
    }
}
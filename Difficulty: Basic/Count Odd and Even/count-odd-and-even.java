class Solution {
    public int[] countOddEven(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        return new int[]{oddCount, evenCount};
    }
}
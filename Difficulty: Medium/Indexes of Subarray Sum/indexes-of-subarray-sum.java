class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, sum = 0;
        
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            
            // Shrink window from left if sum exceeds target
            while (sum > target && left < right) {
                sum -= arr[left];
                left++;
            }
            
            // Found the subarray
            if (sum == target) {
                result.add(left + 1);   // 1-based index
                result.add(right + 1);  // 1-based index
                return result;
            }
        }
        
        result.add(-1);
        return result;
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        
        int closestSum = nums[0] + nums[1] + nums[2];
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Two pointer approach
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                // Update closest sum if current sum is closer to target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                // If we found exact target, return immediately
                if (currentSum == target) {
                    return currentSum;
                }
                // If sum is less than target, move left pointer right
                else if (currentSum < target) {
                    left++;
                }
                // If sum is greater than target, move right pointer left
                else {
                    right--;
                }
            }
        }
        
        return closestSum;
    }
}
public class Solution {
    public int getSecondLargest(int[] arr) {
        // Initialize with -1 as per problem requirements for positive integers
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            // Case 1: Current element is the new largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            // Case 2: Current element is between largest and secondLargest
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 10, 10};

        System.out.println("Second Largest (arr1): " + sol.getSecondLargest(arr1)); // Output: 34
        System.out.println("Second Largest (arr2): " + sol.getSecondLargest(arr2)); // Output: -1
    }
}
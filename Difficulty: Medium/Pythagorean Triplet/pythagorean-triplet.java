import java.util.HashSet;

class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num * num);
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] * arr[i] + arr[j] * arr[j];
                if (set.contains(sum)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
import java.util.*;

class Solution {
    public ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int[] temp = new int[2];
        
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val - 1] > 0) {
                arr[val - 1] = -arr[val - 1];
            } else {
                temp[0] = val;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                temp[1] = i + 1;
                break;
            }
        }
        
        result.add(temp[0]);
        result.add(temp[1]);
        return result;
    }
}
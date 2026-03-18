import java.util.HashMap;

class Solution {
    public static int firstRepeated(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, map.get(arr[i]));
            } else {
                map.put(arr[i], i + 1);
            }
        }
        
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
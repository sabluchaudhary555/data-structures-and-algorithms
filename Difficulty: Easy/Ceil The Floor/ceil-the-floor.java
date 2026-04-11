import java.util.Arrays;

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int[] result = new int[2];
        int floor = -1, ceil = -1;
        
        for (int num : arr) {
            if (num <= x) {
                floor = Math.max(floor, num);
            }
            if (num >= x) {
                if (ceil == -1 || num < ceil) {
                    ceil = num;
                }
            }
        }
        
        result[0] = floor;
        result[1] = ceil;
        return result;
    }
}
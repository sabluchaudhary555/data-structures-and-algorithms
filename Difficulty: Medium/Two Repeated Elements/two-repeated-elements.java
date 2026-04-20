class Solution {
    public int[] twoRepeated(int[] arr) {
        int n = arr.length - 2;
        int[] result = new int[2];
        boolean[] seen = new boolean[n + 1];
        int index = 0;
        
        for (int num : arr) {
            if (seen[num]) {
                result[index++] = num;
            } else {
                seen[num] = true;
            }
        }
        
        return result;
    }
}
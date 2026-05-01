import java.util.Arrays;

class Solution {
    public long[] findElements(long arr[]) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, arr.length - 2);
    }
}
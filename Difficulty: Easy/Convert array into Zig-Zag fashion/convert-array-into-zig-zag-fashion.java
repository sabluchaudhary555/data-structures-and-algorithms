class Solution {
    public static void zigZag(int[] arr) {
        boolean lessThan = true;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (lessThan) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            lessThan = !lessThan;
        }
    }
}
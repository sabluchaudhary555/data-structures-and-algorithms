class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        
        if (n == 0) return res;
        
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        
        return res;
    }
}
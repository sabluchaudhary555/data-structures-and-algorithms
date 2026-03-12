class Solution {
    public int kthElement(int a[], int b[], int k) {
        int m = a.length;
        int n = b.length;
        
        if (m > n) {
            return kthElement(b, a, k);
        }
        
        int left = Math.max(0, k - n);
        int right = Math.min(m, k);
        
        while (left <= right) {
            int midA = left + (right - left) / 2;
            int midB = k - midA;
            
            int leftA = (midA > 0) ? a[midA - 1] : Integer.MIN_VALUE;
            int rightA = (midA < m) ? a[midA] : Integer.MAX_VALUE;
            int leftB = (midB > 0) ? b[midB - 1] : Integer.MIN_VALUE;
            int rightB = (midB < n) ? b[midB] : Integer.MAX_VALUE;
            
            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                right = midA - 1;
            } else {
                left = midA + 1;
            }
        }
        
        return -1;
    }
}
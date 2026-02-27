class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;
        if (arr[0] == 0) return -1;
        
        int jumps = 0;      // number of jumps made
        int curEnd = 0;     // end of current jump range
        int farthest = 0;   // farthest we can reach
        
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            
            if (i == curEnd) {          // must jump here
                jumps++;
                curEnd = farthest;
                
                if (curEnd >= n - 1) return jumps; // reached end
                if (farthest <= i) return -1;       // stuck
            }
        }
        
        return -1;
    }
}
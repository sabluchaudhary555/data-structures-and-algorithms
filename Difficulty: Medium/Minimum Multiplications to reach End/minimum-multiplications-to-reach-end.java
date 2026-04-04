import java.util.*;

class Solution {
    public int minimumMultiplications(int[] arr, int start, int end) {
        if (start == end) return 0;
        
        int mod = 100000;
        int[] dist = new int[mod];
        Arrays.fill(dist, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        dist[start] = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int num : arr) {
                int next = (current * num) % mod;
                
                if (dist[next] == -1) {
                    dist[next] = dist[current] + 1;
                    if (next == end) {
                        return dist[next];
                    }
                    queue.offer(next);
                }
            }
        }
        
        return -1;
    }
}
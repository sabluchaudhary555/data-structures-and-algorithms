class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        // Use index as a hash — negate visited elements
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1; // 1-based to 0-based
            
            if (arr[idx] < 0) {
                result.add(idx + 1); // seen twice → duplicate
            } else {
                arr[idx] = -arr[idx]; // mark as visited
            }
        }
        
        Collections.sort(result); // output in sorted order
        return result;
    }
}
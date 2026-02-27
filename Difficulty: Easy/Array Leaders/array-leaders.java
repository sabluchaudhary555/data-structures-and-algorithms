class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        
        // Rightmost is always a leader
        result.add(arr[n - 1]);
        
        // Traverse from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(arr[i]);
            }
        }
        
        // Reverse to maintain left-to-right order
        Collections.reverse(result);
        return result;
    }
}
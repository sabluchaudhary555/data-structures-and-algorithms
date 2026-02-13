import java.util.*;

class Solution {
    // Function to find common elements in two arrays
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // 1. Use a HashMap to count occurrences in the first array
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // 2. Check the second array for common elements
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : b) {
            if (map.containsKey(x) && map.get(x) > 0) {
                result.add(x);
                // Decrease count so we don't reuse the same element
                map.put(x, map.get(x) - 1);
            }
        }

        // 3. Sort the results as required by the problem
        Collections.sort(result);
        return result;
    }
}
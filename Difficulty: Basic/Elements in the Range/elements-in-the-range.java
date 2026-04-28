import java.util.HashSet;
import java.util.List;

class Solution {
    public boolean checkElements(int start, int end, List<Integer> arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        
        return true;
    }
}
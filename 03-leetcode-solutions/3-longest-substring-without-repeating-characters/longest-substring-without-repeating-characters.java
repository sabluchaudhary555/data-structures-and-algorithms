import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        // Move the right pointer to expand the window
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                // Update maximum length found so far
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                // If character exists, remove from left and shrink window
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
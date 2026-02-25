class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: empty needle
        if (needle.length() == 0) {
            return 0;
        }
        
        // If needle is longer than haystack, it can't be found
        if (needle.length() > haystack.length()) {
            return -1;
        }
        
        // Check each position in haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if substring starting at i matches needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}
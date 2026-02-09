class Solution {
    static String revStr(String s) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder(s);
        
        // Reverse the content and convert it back to a String
        return sb.reverse().toString();
    }
}
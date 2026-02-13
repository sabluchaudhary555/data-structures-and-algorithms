class Solution {
    String isVowel(char c) {
        // 1. Convert to lowercase to check both 'A' and 'a' at once
        char lowerC = Character.toLowerCase(c);
        
        // 2. Check if the character matches any of the five vowels
        if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
            return "YES";
        } else {
            return "NO";
        }
    }
}
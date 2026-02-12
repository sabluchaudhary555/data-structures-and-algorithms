class Solution {
    String isVowel(char c) {
        // Convert to lowercase to check both cases at once
        char lowerC = Character.toLowerCase(c);
        
        // Check if character matches any vowel
        if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
            return "YES";
        } else {
            return "NO";
        }
    }
}
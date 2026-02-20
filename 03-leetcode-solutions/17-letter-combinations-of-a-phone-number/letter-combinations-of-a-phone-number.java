class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Handle empty input
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Mapping of digits to letters
        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        
        // Start backtracking
        backtrack(result, digits, mapping, new StringBuilder(), 0);
        
        return result;
    }
    
    private void backtrack(List<String> result, String digits, String[] mapping, 
                          StringBuilder current, int index) {
        // Base case: if we've processed all digits
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        // Get the letters for the current digit
        String letters = mapping[digits.charAt(index) - '0'];
        
        // Try each letter
        for (char letter : letters.toCharArray()) {
            current.append(letter);  // Choose
            backtrack(result, digits, mapping, current, index + 1);  // Explore
            current.deleteCharAt(current.length() - 1);  // Unchoose (backtrack)
        }
    }
}
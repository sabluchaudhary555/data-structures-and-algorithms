class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, StringBuilder current, 
                          int open, int close, int max) {
        // Base case: if we've used all n pairs
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }
        
        // Add opening parenthesis if we haven't used all n
        if (open < max) {
            current.append('(');
            backtrack(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1);  // backtrack
        }
        
        // Add closing parenthesis if it won't make invalid
        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1);  // backtrack
        }
    }
}
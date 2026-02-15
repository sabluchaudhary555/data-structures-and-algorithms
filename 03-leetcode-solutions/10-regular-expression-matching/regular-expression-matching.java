class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        Boolean[][] memo = new Boolean[m + 1][n + 1];
        return dfs(s, p, 0, 0, memo);
    }
    
    private boolean dfs(String s, String p, int i, int j, Boolean[][] memo) {
        int m = s.length(), n = p.length();
        
        // Base case: if we've reached the end of pattern
        if (j == n) {
            return i == m;
        }
        
        // Check memo
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        
        // Check if current characters match
        boolean firstMatch = (i < m) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
        
        // Handle '*' pattern
        if (j + 1 < n && p.charAt(j + 1) == '*') {
            // Two options:
            // 1. Skip the '*' and preceding character (zero occurrences)
            // 2. Use the '*' if first character matches (one or more occurrences)
            boolean result = dfs(s, p, i, j + 2, memo) || 
                            (firstMatch && dfs(s, p, i + 1, j, memo));
            memo[i][j] = result;
            return result;
        } else {
            // No '*', just move to next character if current matches
            boolean result = firstMatch && dfs(s, p, i + 1, j + 1, memo);
            memo[i][j] = result;
            return result;
        }
    }
}
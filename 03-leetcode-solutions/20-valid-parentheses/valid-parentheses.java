class Solution {
    public boolean isValid(String s) {
        // Use a stack to track opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket
            else {
                // Check if stack is empty (no matching opening bracket)
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Pop the top and check if it matches
                char top = stack.pop();
                
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        // Stack should be empty if all brackets are matched
        return stack.isEmpty();
    }
}
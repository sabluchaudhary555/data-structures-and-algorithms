class Solution {
    public int romanToInt(String s) {
        // Create a map for Roman numeral values
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int result = 0;
        
        // Traverse the string from left to right
        for (int i = 0; i < s.length(); i++) {
            int current = roman.get(s.charAt(i));
            
            // If current value is less than next value, subtract it
            if (i < s.length() - 1 && current < roman.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                // Otherwise, add it
                result += current;
            }
        }
        
        return result;
    }
}
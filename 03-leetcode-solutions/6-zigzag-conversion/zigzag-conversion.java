class Solution {
    public String convert(String s, int numRows) {
        
        // Edge case: if only 1 row or string shorter than numRows
        if (numRows == 1 || numRows >= s.length()) return s;

        // Create one StringBuilder per row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Place each character in the correct row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Bounce direction at top and bottom rows
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        // Concatenate all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
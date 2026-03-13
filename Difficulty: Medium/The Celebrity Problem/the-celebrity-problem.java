class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        int top = 0;
        int bottom = n - 1;
        
        while (top < bottom) {
            if (mat[top][bottom] == 1) {
                top++;
            } else {
                bottom--;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i != top) {
                if (mat[top][i] == 1 || mat[i][top] == 0) {
                    return -1;
                }
            }
        }
        
        return top;
    }
}
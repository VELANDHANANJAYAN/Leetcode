class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int x = -1; // Declare `x` outside the loop and initialize it.
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] > target) {
                break;
            }
            x = i; // Update `x` with the current row index.
        }
        
        // Check if `x` was properly updated (if no valid row was found, `x` will still be -1).
        if (x == -1) {
            return false;
        }
        
        // Search within the determined row `x`.
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[x][j] == target) {
                return true;
            }
        }
        
        return false;
    }
}

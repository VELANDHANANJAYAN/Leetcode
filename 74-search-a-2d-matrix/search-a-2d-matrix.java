class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0,high=m-1;
        while(low<n &&high>=0)
        {
            // int mid=(low+high)/2;
            // int row=mid/2;
            // int col=mid%2;
            if(matrix[low][high]==target)
            {
                return true;
            }
            else if(matrix[low][high]>target)
                high--;
            else
                low++;   
        }
        return false;
    }
}

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         // Start from the top-right corner
//         int row = 0, col = cols - 1;

//         while (row < rows && col >= 0) {
//             if (matrix[row][col] == target) {
//                 return true; // Found the target
//             } else if (matrix[row][col] > target) {
//                 col--; // Move left
//             } else {
//                 row++; // Move down
//             }
//         }

//         return false; // Target not found
//     }
// }
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] indexedNums = new int[nums.length][2];

        // Store original indices along with values
        for (int i = 0; i < nums.length; i++) {
            indexedNums[i][0] = nums[i]; // Store value
            indexedNums[i][1] = i; // Store original index
        }

        // Step 1: Sort by value
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Two-pointer search
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = indexedNums[l][0] + indexedNums[r][0];
            if (sum == target) {
                return new int[]{indexedNums[l][1], indexedNums[r][1]}; // Return original indices
            } else if (sum < target) {
                l++; // Move left pointer to increase sum
            } else {
                r--; // Move right pointer to decrease sum
            }
        }
        
        return new int[]{-1, -1}; // Should never reach here based on problem statement
    }
}

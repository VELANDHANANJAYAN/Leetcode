class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low = 0, high = nums.length - 1;
        
        while (low < high) {
            int mid =low+(high-low) / 2;
            
            // Make sure mid is even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Unique element is in the right half
                low = mid + 2;
            } else {
                // Unique element is in the left half (including mid)
                high = mid;
            }
        }
        
        return nums[low]; // or nums[high], both are same here
    }
}

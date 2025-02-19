class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, local = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, local);
                local = 0;
                continue;
            }
            local++;
        }
        
        max = Math.max(max, local);
        return max;
    }
}

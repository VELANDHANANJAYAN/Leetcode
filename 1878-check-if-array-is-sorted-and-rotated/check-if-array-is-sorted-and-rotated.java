class Solution {
    public boolean check(int[] nums) {
        int dip=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                dip++;
            }
        } 
        if(nums[0]<nums[nums.length-1])
            dip++;   
        if(dip<2)   return true;
        return false;
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     int value=map.getOrDefault(nums[i],0);
        //     map.put(nums[i],value+1);
        // }
        // for(Map.Entry<Integer,Integer> it:map.entrySet()){
        //     if(it.getValue()==1){
        //         return it.getKey();
        //     }
        // }
        // return 0;
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        return xor;
    }
}
class Solution3{
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int values=nums[i];
             ans[i]=nums[values];
        }
        return ans;
    }
}
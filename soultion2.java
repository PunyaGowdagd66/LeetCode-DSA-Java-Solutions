class Solution2 {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[2*n];
        for(int i=0;i<n;i++){
            int x=nums[i];
            int y=nums[i+n];
        res[2*i]=x;
        res[2*i+1]=y;
        }
        return res;
        
    }
}
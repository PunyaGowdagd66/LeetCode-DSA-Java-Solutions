class Solutionarray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k= k% n;
        //int start=0;
      //  int end=n-1;
      reverse(nums,0,n-1);//reverse whole array
      reverse(nums,0,k-1);//reverse 1st k elem
      reverse(nums,k,n-1);//reverse last k elem
    }
    //reverse function calls

     public void reverse(int []nums,int start,int end)   {

        while(start<end){
            int temp=nums[start];  //swaping int temp=int a;
            nums[start]=nums[end];//         int a=int b;
            nums[end]=temp;         //      int b=tem;
            start++;
            end--;

        }
     }
    
}
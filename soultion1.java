class Solution1{
    public int maximumWealth(int[][] accounts) {
         int max = 0; // stores richest wealth
      for(int i=0;i<accounts.length;i++){
                int sum = 0;//stores the current customer wealth
        for(int j=0;j<accounts[i].length;j++){
            sum = sum + accounts[i][j];
        }
            max = Math.max(max, sum); //compares value which is bigger one returns the larger               value
      }   
    
        return max;
    }
}
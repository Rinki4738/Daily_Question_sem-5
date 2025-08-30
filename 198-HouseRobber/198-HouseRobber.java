// Last updated: 8/30/2025, 3:56:06 PM
class Solution {
     

    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return func(nums,nums.length-1,dp);
       
        
        
    }
   
    public int func(int nums[],int idx,int dp[]){
        if(idx==0){
            return nums[0];
        }
        if(idx<0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
       int pick=func(nums,idx-2,dp)+nums[idx];
       int not_pick=func(nums,idx-1,dp)+0;

       return dp[idx]=Math.max(pick,not_pick);

    }
}
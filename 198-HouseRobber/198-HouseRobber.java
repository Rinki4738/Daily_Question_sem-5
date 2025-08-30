// Last updated: 8/30/2025, 4:40:41 PM
class Solution {
     

    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i-2>=0)
            pick=dp[i-2]+nums[i];
            int not_pick=dp[i-1];
            dp[i]=Math.max(pick,not_pick);

        }
        return dp[nums.length-1];
       
        
        
    }
   
   
}
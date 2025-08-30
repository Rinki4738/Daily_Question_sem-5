// Last updated: 8/30/2025, 7:53:22 PM
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp[]=new int[nums.length-1];
        dp[0]=nums[0];
        
        for(int i=1;i<nums.length-1;i++){
            int pick=nums[i];
            if(i-2>=0){
            pick=dp[i-2]+nums[i];}
            int not_pick=dp[i-1];
            dp[i]=Math.max(pick,not_pick);

        }

        int dp2[]=new int[nums.length];
        dp2[1]=nums[1];
       
        for(int i=2;i<nums.length;i++){
            int pick=nums[i];
            if(i-2>=0){
            pick=dp2[i-2]+nums[i];}
            int not_pick=dp2[i-1];
            dp2[i]=Math.max(pick,not_pick);

        }


        return Math.max(dp[nums.length-2],dp2[nums.length-1]);
        
    }
}
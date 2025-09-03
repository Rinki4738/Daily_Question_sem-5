// Last updated: 9/3/2025, 12:04:54 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return Math.min(func(cost,0,dp),func(cost,1,dp));
        
    }
    public static int func(int cost[],int idx,int dp[]){
        if(idx>=cost.length){
            return 0;
        }

        if(dp[idx]!=-1){
            return dp[idx];
        }

        int left=func(cost,idx+2,dp)+cost[idx];
        int right=func(cost,idx+1,dp)+cost[idx];
        return dp[idx]=Math.min(left,right);
    }
}
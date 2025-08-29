// Last updated: 8/29/2025, 9:33:09 PM
class Solution {
    public int climbStairs(int n) {
        
        int dp[]=new int[n+1];
        return func(n,dp);
       
       
    }
    public int func(int n,int dp[]){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        if(dp[n]!=0){
            return dp[n];
        }

        int left=func(n-1,dp);
        int right=func(n-2,dp);
       
        return dp[n]=left+right;
    }
    
}
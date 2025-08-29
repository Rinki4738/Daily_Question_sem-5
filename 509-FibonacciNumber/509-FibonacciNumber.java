// Last updated: 8/29/2025, 8:58:14 PM
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
       int dp[]=new int[n+1];
      
      dp[0]=0;
      dp[1]=1;
      for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
      }
      return dp[n];
        

        
    }
}
// Last updated: 9/3/2025, 12:34:40 PM
class Solution {
    //forward moving increasing ==LIS type questions
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    int x=dp[j];
                    dp[i]=Math.max(dp[i],x+1);

                }
            }
            max=Math.max(dp[i],max);
           
        }
        return max;

       
        
    }
}
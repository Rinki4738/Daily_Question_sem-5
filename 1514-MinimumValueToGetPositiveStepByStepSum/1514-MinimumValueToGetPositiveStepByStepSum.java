// Last updated: 8/14/2025, 3:43:31 PM
class Solution {
    public int minStartValue(int[] nums) {
      int sum=0;
      int ans=0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        int k=(1-sum);
        ans=Math.max(ans,k);
      }
      if(ans==0){
        return 1;
      }
      return ans;
       

        
    }
}
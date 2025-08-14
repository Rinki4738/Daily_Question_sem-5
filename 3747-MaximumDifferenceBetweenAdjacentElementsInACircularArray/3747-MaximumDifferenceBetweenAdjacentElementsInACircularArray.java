// Last updated: 8/14/2025, 3:41:11 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=0;
        int d=0;
        for(int i=0;i<nums.length-1;i++){
             d=Math.abs(nums[i+1]-nums[i]);
           ans= Math.max(ans,d);
        }
        d=Math.abs(nums[nums.length-1]-nums[0]);
          ans= Math.max(ans,d);
          return ans;
        
        
    }
}
// Last updated: 8/14/2025, 3:41:25 PM
class Solution {
    public double minimumAverage(int[] nums) {
      
        double ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int i=0;int j=nums.length-1;
        while(i<j){
            double avg=(nums[i]+nums[j])/2.0;
           ans=Math.min(ans,avg);
            
            i++;
            j--;
        }
        return ans;
        
    }
}
// Last updated: 8/14/2025, 3:47:37 PM
class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>=nums[lo]){
                ans= Math.min(nums[lo],ans);
                lo=mid+1;

            }
            else if(nums[mid]<=nums[hi]){
                ans= Math.min(nums[mid],ans);
                hi=mid-1;
            }
            
        }
        return ans;
        
    }
}
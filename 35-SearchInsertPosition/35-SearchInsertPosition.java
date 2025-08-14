// Last updated: 8/14/2025, 3:49:22 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
         int n=nums.length;
        int lo=0;
        int hi=nums.length-1;
        int ans=0;
        if(target>nums[n-1]){
            return n;
        }
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>=target){
                ans=mid;
               hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return (ans);
    }
}
    
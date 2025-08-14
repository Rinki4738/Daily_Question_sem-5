// Last updated: 8/14/2025, 3:49:25 PM
class Solution {
    public int search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
             if(target==nums[mid]){
                    return mid;
                }
            if(nums[mid]>=nums[lo]){
               
                if(target>=nums[lo] && target<nums[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }else{
                if(target>=nums[mid] && target<=nums[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return -1;
        
    }
}
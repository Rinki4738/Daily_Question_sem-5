// Last updated: 8/14/2025, 3:49:24 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
       int lo=0;
        int hi=nums.length-1;
        int ans[]={-1,-1};
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>=target){
                ans[0]=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }if( ans[0]>=0 && nums[ans[0]]!=target){
            ans[0]=-1;
        }

        int l=0;
        int h=nums.length-1;
         while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<=target){
                ans[1]=mid;
               l=mid+1;
            }
            else{
                
                 h=mid-1;
            }
        }
        if(ans[1]>=0 && nums[ans[1]]!=target){
            ans[1]=-1;
        }
        
       
       
       return ans;
    }}
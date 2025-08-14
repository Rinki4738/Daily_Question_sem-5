// Last updated: 8/14/2025, 3:46:43 PM
class Solution {
    public int hIndex(int[] nums) {
        int lo=0;
        int hi=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
            max=nums[i];
        }
        hi=max;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(nums,mid)==true){
               ans= mid;
               lo=mid+1;
            }else{
                hi=mid-1;

            }
        }return ans;
    }public static boolean isitpossible(int nums[],int h){
        int lo=0;
        int hi=nums.length-1;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>=h){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }

        }if((nums.length)-ans>=h){
            return true;
        }else{
            return false;
        }
    }
}
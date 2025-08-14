// Last updated: 8/14/2025, 3:41:03 PM
class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        return(func(nums.clone(),1,k)||func(nums.clone(),-1,k));
         
       
    }
    public static boolean func(int nums[],int tar,int k){
        int op=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=tar){
                nums[i]*=-1;
                nums[i+1]*=-1;
                op++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=tar){
                return false;
            }
        }
       if(op<=k){
           return true;
       }
        return false;
    }
}
// Last updated: 8/14/2025, 3:49:14 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        int mi=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                mi=nums[i];
                break;
            }
        }
        if(mi>1){
            return 1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>0 && nums[i+1]!=nums[i] && nums[i+1]-nums[i]!=1){
               return nums[i]+1;
            }
        }
        if( nums[nums.length-1]>0){
        return nums[nums.length-1]+1;}
        else{
            return 1;
        }
        
        
    }
}
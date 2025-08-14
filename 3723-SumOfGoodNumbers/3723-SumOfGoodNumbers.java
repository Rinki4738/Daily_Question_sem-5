// Last updated: 8/14/2025, 3:41:14 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(i-k>=0 && i+k<nums.length && (nums[i-k]>=nums[i]||nums[i+k]>=nums[i])){
                continue;
            }
            if(i-k<0 && nums[i+k]>=nums[i]){
                continue;
            }
            if(i+k>=nums.length && nums[i-k]>=nums[i]){
                   continue;
            }
            s+=nums[i];
            }
        
            return s;}}
        
        

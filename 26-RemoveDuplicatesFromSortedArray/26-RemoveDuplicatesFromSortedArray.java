// Last updated: 8/14/2025, 3:49:31 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[idx]){
                nums[idx+1]=nums[i];
                idx++;
            }
            
        }
        return idx+1;

        
    }
}
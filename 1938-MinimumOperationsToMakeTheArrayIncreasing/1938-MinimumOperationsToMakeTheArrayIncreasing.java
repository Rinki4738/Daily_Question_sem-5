// Last updated: 8/14/2025, 3:42:38 PM
class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<=nums[i]){
                while(nums[i]>=nums[i+1]){
                   nums[i+1]++;
                    c++;
                }
            }
        }
        return c;
       
        
    }
}
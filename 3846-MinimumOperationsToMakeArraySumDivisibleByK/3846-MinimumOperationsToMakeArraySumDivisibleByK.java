// Last updated: 8/14/2025, 3:41:01 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
       
            return sum%k;
        
        
    }
}
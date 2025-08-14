// Last updated: 8/14/2025, 3:43:25 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=nums[i]+sum[i-1];
        }
        return sum;
    }
}
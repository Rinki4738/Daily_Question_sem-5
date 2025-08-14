// Last updated: 8/14/2025, 3:42:29 PM
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int dividend=nums[nums.length-1];
        int divisor=nums[0];
        int rem=dividend%divisor;
        while(rem!=0){
            dividend=divisor;
            divisor=rem;
            rem=dividend%divisor;
        }
        return divisor;

    }
}
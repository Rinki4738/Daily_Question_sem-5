// Last updated: 8/14/2025, 3:47:31 PM
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int ma=0;
        for(int i=0;i<nums.length-1;i++){
            int d=nums[i+1]-nums[i];
           ma=Math.max(ma,d);

        }
        return ma;
        
    }
}
// Last updated: 8/14/2025, 3:46:08 PM
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int si=0;
        int ei=2;
        int c=0;
        int d=nums[1]-nums[0];
        while(ei<nums.length){
            if(nums[ei]-nums[ei-1]==d){
                c++;
                c+=(ei-si+1)-3;
                
            }else if(nums[ei]-nums[ei-1]!=d){
                si=ei-1;
                d=nums[ei]-nums[ei-1];
            }
            ei++;

        }
        return c;
        
    }
}
// Last updated: 8/14/2025, 3:45:06 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0;
        int si=0;
        int ei=0;
        int p=1;
        while(ei<nums.length){
            p*=nums[ei];
            while(p>=k && si<=ei){
                p=p/nums[si];
                si++;
            }
            c+=(ei-si+1);
            ei++;


        }
        return c;
        
    }
}
// Last updated: 8/14/2025, 3:42:59 PM
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int si=0;
        int ei=nums.length-1;
        int c=0;
        while(si<ei){
            if((nums[si]+nums[ei])<k){
                si++;
            }else if((nums[si]+nums[ei])>k){
                ei--;
            }else{
                c++;
                si++;
                ei--;
            }
        }
        return c;
        
    }
}
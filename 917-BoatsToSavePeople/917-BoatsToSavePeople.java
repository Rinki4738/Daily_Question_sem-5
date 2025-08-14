// Last updated: 8/14/2025, 3:44:30 PM
class Solution {
    public int numRescueBoats(int[] nums, int limit) {
       Arrays.sort(nums);
       int si=0;
       int ei=nums.length-1;
       int b=0;
       while(si<=ei){
      if(nums[si]+nums[ei]<=limit){
        si++;
      }
      ei--;
      b++;

       }return b;
    }} 
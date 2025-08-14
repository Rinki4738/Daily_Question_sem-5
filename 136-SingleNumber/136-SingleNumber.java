// Last updated: 8/14/2025, 3:47:49 PM
class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int ele:nums){
            a=a^ele;
        }
        return a;
    }}
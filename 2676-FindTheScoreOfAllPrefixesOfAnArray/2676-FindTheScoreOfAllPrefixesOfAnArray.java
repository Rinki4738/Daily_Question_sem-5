// Last updated: 8/14/2025, 3:41:45 PM
class Solution {
    public long[] findPrefixScore(int[] nums) {
        long res[]=new long[nums.length];
        long max[]=new long[nums.length];
        max[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            max[i]=Math.max(max[i-1],nums[i]);
        }
        res[0]=nums[0]*2;

       long s=res[0]; 
        for(int i=1;i<nums.length;i++){
           s+=max[i]+nums[i];
           res[i]=s;
        }
        return res;
        
    }
}
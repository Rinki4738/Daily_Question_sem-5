// Last updated: 8/14/2025, 3:47:14 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int s=0;
        int maxsize=Integer.MAX_VALUE;
        while(j<nums.length){
            s+=nums[j];
            if(s<target){
                j++;
            }
            else if(s>=target){
                if(j-i+1<maxsize){
                    maxsize=j-i+1;}
                   s=0;
                    i++;
                    j=i;
                
            }
        }
        if(maxsize==Integer.MAX_VALUE){
            maxsize=0;
        }
        return maxsize;
    }
}
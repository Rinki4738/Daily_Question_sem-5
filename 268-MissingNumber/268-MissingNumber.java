// Last updated: 8/14/2025, 3:46:45 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int s=0;
        for(int ele:nums){
            s+=ele;
        }
        return sum-s;
        
    }
}
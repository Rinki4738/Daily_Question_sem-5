// Last updated: 8/14/2025, 3:42:12 PM
class Solution {
    public boolean divideArray(int[] nums) {
        int map[]=new int[501];
        for(int ele:nums){
            map[ele]++;
        }
        for(int i=0;i<nums.length;i++){
            if(map[nums[i]]%2!=0){
                return false;
            }
        }
        return true;
        
    }
}
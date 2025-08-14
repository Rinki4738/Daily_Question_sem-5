// Last updated: 8/14/2025, 3:46:39 PM
class Solution {
    public int findDuplicate(int[] nums) {
       int freq[]=new int[nums.length+1];
       for(int ele:nums){
        freq[ele]++;
       }
       for(int i=1;i<freq.length;i++){
        if(freq[i]>1){
            return i;
        }
       }
       return -1;
    }
}
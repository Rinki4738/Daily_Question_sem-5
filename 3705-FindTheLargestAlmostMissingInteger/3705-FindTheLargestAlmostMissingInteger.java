// Last updated: 8/14/2025, 3:41:18 PM
class Solution {
    public int largestInteger(int[] nums, int k) {
        int freq[]=new int[51];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
     
        if(k!=1 && k<nums.length){
           int a=nums[0];
            int b=nums[nums.length-1];
            if(freq[a]==1 && freq[b]!=1){
                return a;
            }
            if(freq[b]==1 && freq[a]!=1){
                return b;
            }
            if(freq[a]==1 && freq[b]==1){
                return Math.max(a,b);
            }
        }
        if(k==1||k==nums.length){
            int max=-1;
            if(k==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max && freq[nums[i]]==1){
                    max=nums[i];
                }
            }}
            if(k==nums.length){
                for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            }
            if(max!=-1){
                return max;
            }
        }
        return -1;
        
    }
}
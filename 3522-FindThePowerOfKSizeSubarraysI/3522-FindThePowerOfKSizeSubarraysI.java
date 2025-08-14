// Last updated: 8/14/2025, 3:41:23 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int res[]=new int[nums.length-k+1];
        int si=0;
        int ei=0;
        int p=0;
        while(ei<nums.length){
            
            if(ei-si+1==k){
                if(cons(nums,si,ei)){
                    res[p++]=nums[ei];
                }
                else{
                    res[p++]=-1;
                }
                si++;
            }ei++;
        }return res;
        
    }public static boolean cons(int nums[],int i,int j){
        for(int k=i;k<j;k++){
            if(nums[k+1]-nums[k]!=1){
                return false;
            }
        }return true;
    }
}
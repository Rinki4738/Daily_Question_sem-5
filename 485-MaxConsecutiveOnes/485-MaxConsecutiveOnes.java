// Last updated: 8/14/2025, 3:45:50 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int c=0;
        for(int ele:nums){
            if(ele==1){c++;}
            else{
                ans=Math.max(ans,c);
                c=0;
            }
        }
         ans=Math.max(ans,c);
        return ans;
        
    }
}
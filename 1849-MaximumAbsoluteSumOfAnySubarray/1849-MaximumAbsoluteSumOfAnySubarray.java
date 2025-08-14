// Last updated: 8/14/2025, 3:42:48 PM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int s=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(s<0){
                s=0;
            }
            ans=Math.max(ans,s);
        }
        int s1=0;
        int ans1=Integer.MAX_VALUE;
         for(int i=0;i<nums.length;i++){
            s1+=nums[i];
            if(s1>0){
                s1=0;
            }
            ans1=Math.min(ans1,s1);
        }
        ans=Math.abs(ans);
        ans1=Math.abs(ans1);
        return Math.max(ans,ans1);


      
        
    }
}
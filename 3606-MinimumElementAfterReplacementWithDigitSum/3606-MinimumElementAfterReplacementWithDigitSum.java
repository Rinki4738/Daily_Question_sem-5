// Last updated: 8/14/2025, 3:41:20 PM
class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int s=0;
            while(num>0){
                int r=num%10;
                s+=r;
                num=num/10;
            }
            ans=Math.min(s,ans);
        }
        return ans;
        
    }
}
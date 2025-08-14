// Last updated: 8/14/2025, 3:49:41 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=Integer.MAX_VALUE;
        int  ans=0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=target-sum;
                diff=Math.abs(diff);
               if(diff<closest){
                ans=sum;
                closest=diff;
               }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    return target;
                }
            }
        }
        return ans;
        
    }
}
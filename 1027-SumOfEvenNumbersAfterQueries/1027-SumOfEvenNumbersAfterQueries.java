// Last updated: 8/14/2025, 3:44:09 PM
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int ans[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum+=nums[i];
            }
        }
        int k=0;
        for(int i=0;i<queries.length;i++){
            int a=nums[queries[i][1]];
            nums[queries[i][1]]+=queries[i][0];
            if(a%2==0)
                sum=sum-a;
            if(nums[queries[i][1]]%2==0)
                sum=sum+nums[queries[i][1]];
                ans[k++]=sum;
            
        }
        return ans;
        
    }
}
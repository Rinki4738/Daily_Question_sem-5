// Last updated: 8/14/2025, 3:49:00 PM
class Solution {
    public int maxSubArray(int[] nums) {
        return  kadanes(nums);
    }
   public static int kadanes(int[]arr){
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans,sum);
			if(sum<0) {
				sum=0;
			}
		}
		
		return ans;
	}
}
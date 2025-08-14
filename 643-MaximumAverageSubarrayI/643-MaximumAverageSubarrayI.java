// Last updated: 8/14/2025, 3:45:16 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double t=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int s=0;
            for(int j=i;j<i+k;j++){
                s+=nums[j];

            }
            if(((double)(s)/k)>t)
            t=((double)(s)/k);
        }
        return t;
}
    }
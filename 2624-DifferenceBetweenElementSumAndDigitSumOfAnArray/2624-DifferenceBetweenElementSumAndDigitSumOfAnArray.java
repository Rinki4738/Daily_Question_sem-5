// Last updated: 8/14/2025, 3:41:50 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int num=nums[i];
            while(num>0){
                dsum+=num%10;
                num=num/10;
            }

        }return Math.abs(sum-dsum);
        
    }
}
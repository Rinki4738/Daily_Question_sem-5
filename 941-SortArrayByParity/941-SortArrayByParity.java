// Last updated: 8/14/2025, 3:44:24 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;
        }
            if(nums[j]%2==0 && nums[i]%2!=0){
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                i++;
                j--;

            }else if(nums[j]%2!=0){
                j--;
            }
        
        }return nums;

        
    }
}
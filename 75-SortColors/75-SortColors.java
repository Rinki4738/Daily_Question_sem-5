// Last updated: 8/14/2025, 3:48:37 PM
class Solution {
    public void sortColors(int[] nums) {
        int f[]=new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                f[0]++;
            }
            else if(nums[i]==1){
                f[1]++;
            }
            else{
                f[2]++;
            }
        }
        int k=0;
        for(int i=0;i<f[0];i++){
            nums[k++]=0;
        }
        for(int i=0;i<f[1];i++){
            nums[k++]=1;
        }
        for(int i=0;i<f[2];i++){
            nums[k++]=2;
        }
        
    }
}
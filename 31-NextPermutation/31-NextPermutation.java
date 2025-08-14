// Last updated: 8/14/2025, 3:49:27 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int p=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(nums,0,n-1);
            return;
        }
        int q=-1;
        for(int i=n-1;i>=p;i--){
            if(nums[i]>nums[p]){
                q=i;
                break;
            }
        }
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
        reverse(nums,p+1,n-1);
  
    }
    public static void reverse(int nums[],int i,int j){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}
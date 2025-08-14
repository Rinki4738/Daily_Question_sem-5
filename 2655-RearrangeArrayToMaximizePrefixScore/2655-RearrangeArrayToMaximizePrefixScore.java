// Last updated: 8/14/2025, 3:41:47 PM
class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        int p=0;
        if(nums[0]>0){
            p++;
        }
       long s=0;
        s=nums[0];
        for(int i=1;i<nums.length;i++){
            if(s+nums[i]>0){
                p++;
                
            }
            s+=nums[i];

        }
        return p;
    }
    public static void reverse(int nums[]){
        int i=0;int j=nums.length-1;
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}
// Last updated: 8/14/2025, 3:43:36 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int tar[]=new int[nums.length];
        int z=0;
        for(int i=0;i<index.length;i++){
            if(index[i]==0 && nums[i]==0){
                z++;
            }
            if(tar[index[i]]==0 && z<2){
                tar[index[i]]=nums[i];
            }else{
                int j=i;
                while(j>index[i]){
                    tar[j]=tar[j-1];
                    j--;
                }
                tar[index[i]]=nums[i];

            }
        }
    return tar;

        
    }
}
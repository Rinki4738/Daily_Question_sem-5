// Last updated: 8/14/2025, 3:48:31 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int a=nums[0];
        int b=nums[1];
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(a==b){
                if(nums[i]!=b){
                    nums[k++]=nums[i];
                  
                }

            }else{
           
                nums[k++]=nums[i];
               
            
            }
             a=b;
            b=nums[i];
        }
        return k;



        
    }
}
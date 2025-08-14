// Last updated: 8/14/2025, 3:47:02 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val1=nums[0];
        int val2=nums[0];
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val1){
                count1++;
            }
            else if(nums[i]==val2){
                count2++;
            }
            else if(count1==0){
                    val1=nums[i];
                    count1=1;
                }
            else if(count2==0){
                    val2=nums[i];
                    count2=1;
                }
            
            else{
                 count1--;
               count2--;
                
              
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        int c=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val1){
                c++;
            }
           else if(nums[i]==val2){
                d++;
            }
        }
        if(c>(nums.length/3)){
            res.add(val1);
        }
        if(d>(nums.length/3)){
            res.add(val2);
        }
        return res;
    }
}
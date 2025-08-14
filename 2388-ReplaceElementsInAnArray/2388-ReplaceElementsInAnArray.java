// Last updated: 8/14/2025, 3:42:06 PM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
    
         HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],i);
        }

         for(int i=0;i<operations.length;i++){
            int val=operations[i][0];
            int k=(map.get(val));
           nums[k]=operations[i][1];
           map.put(nums[k],k);
        }
        
       
        
    return nums;
        
    }
}
// Last updated: 8/14/2025, 3:47:08 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                int value=map.get(nums[i]);
                if(Math.abs(i-value)<=k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }

            }
        }
        return false;

      
        
        
    }
}
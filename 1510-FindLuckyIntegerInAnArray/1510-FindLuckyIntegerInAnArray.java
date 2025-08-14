// Last updated: 8/14/2025, 3:43:33 PM
class Solution {
    public int findLucky(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count = map.containsKey(nums[i]) ? map.get(nums[i]) : 0;
map.put(nums[i], count + 1);
            
        }int ans=-1;
         for (Map.Entry<Integer,Integer> set :
             map.entrySet()) {
                if(set.getKey()==set.getValue()){
                    ans=Math.max(ans,set.getKey());
    
             }
          

        
    }   return ans;
}}
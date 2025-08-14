// Last updated: 8/14/2025, 3:42:00 PM
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int count = map.containsKey(nums[i]) ? map.get(nums[i]) : 0;
map.put(nums[i], count + 1);
            }
        }int ans=-1;
        int val=-1;
         for (Map.Entry<Integer,Integer> set :
             map.entrySet()) {
                if(set.getValue()>ans){
                    val=set.getKey();
                    ans=set.getValue();

                }else if(set.getValue()==ans){
                    val=Math.min(val,set.getKey());
                }

             }
             return val;
               
 

        
        
    }
}
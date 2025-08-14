// Last updated: 8/14/2025, 3:44:20 PM
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],1);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]){
                nums[i+1]++;
                c++;
            }
            else if(map.containsKey(nums[i+1])){
                int val=nums[i+1];
                nums[i+1]=nums[i]+1;
                c+=nums[i+1]-val;

            }
           
            map.put(nums[i+1],1);
        }
        return c;
    }
}
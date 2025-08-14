// Last updated: 8/14/2025, 3:45:57 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> list=new ArrayList<Integer>();
         Arrays.sort(nums);
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i]);
            }
         }return list;
    }
}
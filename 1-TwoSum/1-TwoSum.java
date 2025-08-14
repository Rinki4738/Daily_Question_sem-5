// Last updated: 8/14/2025, 3:49:59 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
    int ans[]=new int[2];
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int a=target-nums[i];
        if(!map.containsKey(a)){
            map.put(nums[i],i);
        }
        else{
            ans[0]=map.get(a);
            ans[1]=i;
        }
    }
    return ans;

}}
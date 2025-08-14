// Last updated: 8/14/2025, 3:41:04 PM
class Solution {
    public int maxSum(int[] nums) {
        return MaxSum(nums);
    }
    public static int MaxSum(int[] nums){
        Set<Integer> set = new HashSet<>();
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        if(set.isEmpty()){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        int res=0;
        for(int n : set){
            res+=n;
        }
        return res;
            
            
    }
}
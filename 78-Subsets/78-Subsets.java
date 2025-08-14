// Last updated: 8/14/2025, 3:48:34 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        subset(nums,ll,ans,0);
        return ans;

        
    }
    public static void subset(int nums[],List<Integer>ll,List<List<Integer>>ans,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }

        subset(nums,ll,ans,idx+1);
        ll.add(nums[idx]);
        subset(nums,ll,ans,idx+1);
        ll.remove(ll.size()-1);
    }
}
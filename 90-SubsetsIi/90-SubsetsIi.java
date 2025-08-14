// Last updated: 8/14/2025, 3:48:24 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer> ll =new ArrayList<>();
         subsequence(nums,ll,ans,0);
         return ans;
        
    }
    public static void subsequence(int nums[],List<Integer>ll,List<List<Integer>> ans,int idx){
            if(idx==nums.length){
                ans.add(new ArrayList<>(ll));
                return ;
            }
           
    if(ll.size()>0 && ll.get(ll.size()-1)==nums[idx]){
         ll.add(nums[idx]);
        subsequence(nums,ll,ans,idx+1);
        ll.remove(ll.size()-1);
    }
    else{
        subsequence(nums,ll,ans,idx+1);
        ll.add(nums[idx]);
        subsequence(nums,ll,ans,idx+1);
        ll.remove(ll.size()-1);
    }}
}
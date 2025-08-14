// Last updated: 8/14/2025, 3:49:09 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans =new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        boolean flag[]=new boolean[nums.length];
        func(nums,ans,ll,flag);
        return ans;
        
    }
    public static void  func(int nums[],List<List<Integer>>ans,List<Integer> ll,boolean flag[]){
        if(ll.size()==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }



        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1] && !flag[i - 1]) continue;
            if(flag[i]==false){
                flag[i]=true;
                ll.add(nums[i]);
                func(nums,ans,ll,flag);
                  flag[i]=false;
                ll.remove(ll.size()-1);
            }
        }
    }
   

}
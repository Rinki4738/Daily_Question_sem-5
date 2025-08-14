// Last updated: 8/14/2025, 3:49:11 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans =new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        func(nums,ans,ll);
        return ans;
        
    }
    public static void  func(int nums[],List<List<Integer>>ans,List<Integer> ll){
        if(ll.size()==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }



        for(int i=0;i<nums.length;i++){
            if(notpresent(ll,nums[i])){
                ll.add(nums[i]);
                func(nums,ans,ll);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean notpresent(List<Integer>ll,int val){
        if(ll.size()==0){
            return true;
        }
        for(int i=0;i<ll.size();i++){
            if(ll.get(i)==val){
                return false;
            }
        }
        return true;
    }

}
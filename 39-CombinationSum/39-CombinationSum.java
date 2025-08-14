// Last updated: 8/14/2025, 3:49:16 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        combination(candidates,target,ll,ans,0);
        return ans;
        
    }
    public static void combination(int candidates[],int target,List<Integer>ll,List<List<Integer>>ans,int idx){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx;i<candidates.length;i++){
            if(target>=candidates[i]){
            ll.add(candidates[i]);
            combination(candidates,target-candidates[i],ll,ans,i);
            ll.remove(ll.size()-1);
        }}
    }
}
// Last updated: 8/14/2025, 3:47:11 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        combination(k,n,1,ll,ans);
        return ans;

    }
    public static void combination(int k,int n,int idx,List<Integer>ll,List<List<Integer>> ans){
        if(n==0 && ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        if(ll.size()>k){
            return;
        }


            for(int i=idx;i<=9;i++){
                if(n>=i){
                    ll.add(i);
                    combination(k,n-i,i+1,ll,ans);
                    ll.remove(ll.size()-1);
                }
            }
    }
}
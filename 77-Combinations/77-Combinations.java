// Last updated: 8/14/2025, 3:48:36 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        combination(n,k,ll,ans,1);
        return ans;

        
    }
    public static void combination(int n,int k,List<Integer>ll,List<List<Integer>> ans,int idx){

        if(k==0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx;i<=n;i++){
            ll.add(i);
            combination(n,k-1,ll,ans,i+1);
            ll.remove(ll.size()-1);
        }
    }
}
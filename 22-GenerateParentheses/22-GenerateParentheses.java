// Last updated: 8/14/2025, 3:49:33 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ll=new ArrayList<>();
        func(n,"",0,0,ll);
        return ll;
        
    }
    public static void func(int n,String ans,int open,int close,List<String>ll){
        if(open==n && close==n){
            ll.add(ans);
            return;
        }
        if(open>n||close>open){
            return;
        }


        func(n,ans+"(",open+1,close,ll);
        func(n,ans+")",open,close+1,ll);

    }
}
// Last updated: 8/14/2025, 3:47:52 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ll=new ArrayList<>();
        func(s,ll,ans,0);
        return ans;

        
    }
    public static void func(String s,List<String>ll,List<List<String>> ans,int idx){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ll));
            return;
        }


        for(int i=idx;i<s.length();i++){
            String a=s.substring(idx,i+1);
            if(ispallindrome(a)){
                ll.add(a);
                func(s,ll,ans,i+1);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean ispallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
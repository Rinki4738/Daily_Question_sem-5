// Last updated: 8/14/2025, 3:41:27 PM
class Solution {
    public List<String> validStrings(int n) {
        List<String>ll=new ArrayList<>();
        print(n,ll,"");
        return ll;
        
    }
    public static void print(int n,List<String>ll,String ans){
        if(ans.length()==n){
            ll.add(ans);
            return;
        }
        if(ans.length()>0 && ans.charAt(ans.length()-1)=='0')
        print(n,ll,ans+"1");
        else{ 
         print(n,ll,ans+"0");
           print(n,ll,ans+"1");}
    }
}
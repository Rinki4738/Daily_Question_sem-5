// Last updated: 8/14/2025, 3:49:39 PM
class Solution {
    public List<String> letterCombinations(String digits) {
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ll=new ArrayList<>();
        if(digits.length()==0){
            return ll;
        }
        func(digits,arr,"",ll);
        return ll;
        
    }

public static void func(String digits,String arr[],String ans,List<String>ll){
    if(digits.length()==0){
        ll.add(ans);
        return;
    }
    String a=arr[digits.charAt(0)-'0'];
    for(int i=0;i<a.length();i++){
        func(digits.substring(1),arr,ans+a.charAt(i),ll);

    }
}}
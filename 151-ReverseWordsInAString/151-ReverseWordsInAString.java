// Last updated: 8/14/2025, 3:47:40 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\s+");//regex of space is \s
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        return ans.trim();
    }
}
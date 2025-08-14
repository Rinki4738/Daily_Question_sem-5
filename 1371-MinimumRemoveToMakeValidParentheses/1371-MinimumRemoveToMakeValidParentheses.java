// Last updated: 8/14/2025, 3:43:42 PM
class Solution {
    public String minRemoveToMakeValid(String s) {
      StringBuilder sb=new StringBuilder(s);
      int start=0;
      int close=0;
      int i=0;
      while(i<sb.length()){
        if(sb.charAt(i)=='('){
            start++;
        }
        else if(sb.charAt(i)==')'){
            close++;
        }
        if(close>start){
            sb.deleteCharAt(i);
           close--;
           i--;
        }
        i++;
      }
      System.out.print(sb);
     start=0;
       close=0;
      int j=sb.length()-1;
      while(j>=0){
        if(sb.charAt(j)=='('){
            start++;
        }
        else if(sb.charAt(j)==')'){
            close++;
        }
        if(start>close){
            sb.deleteCharAt(j);
            start--;
           
        }
        j--;
      }
       return sb.toString() ;

           
    }
}
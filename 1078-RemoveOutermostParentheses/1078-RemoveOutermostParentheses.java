// Last updated: 8/14/2025, 3:43:59 PM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                c--;
            }
             if(c!=0){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                c++;
            }
           
        }
        return sb.toString();
        
       
        
        
    }
}
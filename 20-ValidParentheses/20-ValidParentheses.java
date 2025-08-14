// Last updated: 8/14/2025, 3:49:36 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)==')'){
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(!st.isEmpty() && s.charAt(i)==']'){
                if(st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(!st.isEmpty() && s.charAt(i)=='}'){
                if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty();
        
    }
}
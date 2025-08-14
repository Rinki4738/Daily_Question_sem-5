// Last updated: 8/14/2025, 3:44:43 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
           if(!st.isEmpty() && s.charAt(i)=='#'){
                st.pop();
                continue;
            }
            else if(st.isEmpty() && s.charAt(i)=='#'){
                 continue;
            }
            st.push(s.charAt(i));
        }
        StringBuilder  ans=new StringBuilder();
        for(char a:st){
            ans.append(a);
        }

         Stack<Character> st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(!st2.isEmpty() && t.charAt(i)=='#'){
                st2.pop();
                continue;
            }
             else if(st2.isEmpty() && t.charAt(i)=='#'){
                 continue;
            }
            st2.push(t.charAt(i));
        }
        StringBuilder  ans2=new StringBuilder();
        for(char a:st2){
            ans2.append(a);
        }
        // System.out.println(ans);
        // System.out.println(ans2);
        return ans.toString().equals(ans2.toString());
        
    }
}
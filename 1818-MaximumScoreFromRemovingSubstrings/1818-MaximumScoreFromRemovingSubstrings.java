// Last updated: 8/14/2025, 3:42:54 PM
class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans=0;
        if(x>y){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='b'){
                if(st.peek()=='a'){
                    st.pop();
                    ans+=x;
                    continue;
                }
            }
            st.push(s.charAt(i));
        }
        String s1="";
        for(char a:st){
            s1+=""+a;
        }
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s1.length();i++){
            if(!st2.isEmpty() && s1.charAt(i)=='a'){
                if(st2.peek()=='b'){
                    st2.pop();
                    ans+=y;
                    continue;
                }
            }
            st2.push(s1.charAt(i));
        }}
        else{
            Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='a'){
                if(st.peek()=='b'){
                    st.pop();
                    ans+=y;
                    continue;
                }
            }
            st.push(s.charAt(i));
        }
        String s1="";
        for(char a:st){
            s1+=""+a;
        }
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s1.length();i++){
            if(!st2.isEmpty() && s1.charAt(i)=='b'){
                if(st2.peek()=='a'){
                    st2.pop();
                    ans+=x;
                    continue;
                }
            }
            st2.push(s1.charAt(i));
        }

        }
        return ans;
    }
}
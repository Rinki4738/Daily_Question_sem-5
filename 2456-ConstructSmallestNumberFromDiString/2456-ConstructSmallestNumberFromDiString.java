// Last updated: 8/14/2025, 3:42:05 PM
class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[pattern.length()+1];
        int c=1;
        for(int i=0;i<=pattern.length();i++){
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    int idx=st.pop();
                    ans[idx]=c;
                    c++;
                }

            }
            else{
                st.push(i);
               
            }
        }
        String res="";
        for(int i=0;i<ans.length;i++){
            res+=ans[i];
        }
        return res;
        
    }
}
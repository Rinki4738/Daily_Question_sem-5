// Last updated: 8/14/2025, 3:46:13 PM
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        int c=0;
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && num.charAt(i)<num.charAt(st.peek()) && c<k){
                st.pop();
                c++;

            }
            st.push(i);
        }
         while(!st.isEmpty()  && c<k){
                st.pop();
                c++;

            }
           StringBuilder sb=new StringBuilder();
          while(!st.isEmpty()){
            sb.append(num.charAt(st.pop()));
          }
        //   System.out.println(sb);
          while(sb.length()!=0 && sb.charAt(sb.length()-1)=='0'){
           sb.deleteCharAt(sb.length()-1);
          }
          if(sb.length()==0){
            return "0";
          }
          return sb.reverse().toString();

       
        
    }
}
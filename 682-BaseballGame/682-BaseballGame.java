// Last updated: 8/14/2025, 3:45:10 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int a=st.peek();
                st.push(2*a);
            }
            else if(operations[i].equals("+")){
                int one=st.pop();
                int two=st.pop();
                st.push(two);
                st.push(one);
                st.push(one+two);

            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
        
    }
}
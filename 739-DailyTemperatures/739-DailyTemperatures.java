// Last updated: 8/14/2025, 3:44:57 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int idx=st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }

        return ans;
    }
}
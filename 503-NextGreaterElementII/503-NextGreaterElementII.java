// Last updated: 8/28/2025, 3:58:58 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<2*nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i%nums.length]){
                ans[st.pop()]=nums[i%nums.length];
            }
            if(i<nums.length)
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
        
    }
}
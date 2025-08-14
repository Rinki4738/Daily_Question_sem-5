// Last updated: 8/14/2025, 3:45:46 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<2*nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i%nums.length]){
                int idx=st.pop();
                ans[idx]=nums[i%nums.length];
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
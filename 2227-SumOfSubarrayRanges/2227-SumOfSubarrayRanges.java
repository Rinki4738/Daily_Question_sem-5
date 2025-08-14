// Last updated: 8/14/2025, 3:42:23 PM
class Solution {
    public long subArrayRanges(int[] nums) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        long ans=0;
       long ans2=0;
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
                int idx=st.pop();
                int r=i-idx;
                if(!st.isEmpty()){
                    int l=idx-st.peek();
                    ans+=(long)nums[idx]*l*r;
                }
                else{
                    int l=idx+1;
                    ans+=(long)nums[idx]*l*r;
                }
            }
            st.push(i);}
             while(!st.isEmpty()){
                int idx=st.pop();
                int r=nums.length-idx;
                if(!st.isEmpty()){
                    int l=idx-st.peek();
                    ans+=(long)nums[idx]*l*r;
                }
                else{
                    int l=idx+1;
                    ans+=(long)nums[idx]*l*r;
                }
            }
        
        for(int i=0;i<nums.length;i++){
            while(!st2.isEmpty() && nums[i]>nums[st2.peek()]){
                int idx=st2.pop();
                int r=i-idx;
                if(!st2.isEmpty()){
                    int l=idx-st2.peek();
                    ans2+=(long)nums[idx]*l*r;
                }
                else{
                    int l=idx+1;
                    ans2+=(long)nums[idx]*l*r;
                }
            }
            st2.push(i);}
             while(!st2.isEmpty()){
                int idx=st2.pop();
                int r=nums.length-idx;
                if(!st2.isEmpty()){
                    int l=idx-st2.peek();
                    ans2+=(long)nums[idx]*l*r;
                }
                else{
                    int l=idx+1;
                    ans2+=(long)nums[idx]*l*r;
                }
            }
        
        return ans2-ans;
      
    }
}
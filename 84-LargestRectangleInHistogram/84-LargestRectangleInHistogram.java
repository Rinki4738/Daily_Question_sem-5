// Last updated: 8/14/2025, 3:48:29 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int right=i;
                int height=heights[st.pop()];
                if(st.isEmpty()){
                    // int left=-1;
                    int area=height*(right);
                    ans=Math.max(ans,area);
                }
                else{
                    int left=st.peek();
                    int area=height*(right-left-1);
                    ans=Math.max(ans,area);
                }

            }
            st.push(i);
        }
         while(!st.isEmpty()){
                int right=heights.length;
                int height=heights[st.pop()];
                if(st.isEmpty()){
                    // int left=-1;
                    int area=height*(right);
                    ans=Math.max(ans,area);
                }
                else{
                    int left=st.peek();
                    int area=height*(right-left-1);
                    ans=Math.max(ans,area);
                }

            }
            return ans;
        
    }
}
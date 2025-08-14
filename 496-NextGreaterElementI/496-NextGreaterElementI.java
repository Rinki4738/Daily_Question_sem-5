// Last updated: 8/14/2025, 3:45:49 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
                while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                    map.put(nums2[st.pop()],nums2[i]);
                    
                }
                
                st.push(i);
            
        }
        while(!st.isEmpty()){
            int idx=st.pop();
           map.put(nums2[idx],-1);

        }
       for(int i=0;i<nums1.length;i++){
        ans[i]=map.get(nums1[i]);
       }
       return ans;
        
    }
   
}
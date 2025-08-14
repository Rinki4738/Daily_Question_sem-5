// Last updated: 8/14/2025, 3:44:23 PM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        long mod=1000000007;
        Stack<Integer> st=new Stack<>();
        long total=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                
                int idx=st.pop();
                int r=(i-idx);
                if(!st.isEmpty()){
                    int l=(idx-st.peek());
                    total=(total+((long)(r)*(l)*arr[idx]%mod))%mod;
                }
                else{
                    int l=idx+1;
                    total=(total+((long)(r)*(l)*arr[idx]%mod))%mod;
                }
            }
            st.push(i);

        }
         while(!st.isEmpty()){
              
                int idx=st.pop();
                  int r=arr.length-idx;
                if(!st.isEmpty()){
                    int l=(idx-st.peek());
                    total=(total+((long)(r)*(l)*arr[idx]%mod))%mod;
                }
                else{
                    int l=idx+1;
                    total=total+((long)(r)*(l)*arr[idx]%mod)%mod;
                }
            }
            return (int)total;

            

        
    }
}
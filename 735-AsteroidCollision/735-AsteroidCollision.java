// Last updated: 8/14/2025, 3:44:58 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            boolean flag=true;
            while(!st.isEmpty() && asteroids[st.peek()]>0 && asteroids[i]<0){
                if(Math.abs(asteroids[i])<asteroids[st.peek()]){
                    flag=false;
                    break;

                }
                else if(Math.abs(asteroids[i])==asteroids[st.peek()]){
                    st.pop();
                    flag=false;
                    break;

                }else{
                    flag=true;
                    st.pop();
                    
                }

            }
            if(flag){
                st.push(i);
            }
            

        }
        int i=0;
        int res[]=new int[st.size()];
        for(int ele:st){
            res[i++]=asteroids[ele];
        }
        return res;
        
    }
}
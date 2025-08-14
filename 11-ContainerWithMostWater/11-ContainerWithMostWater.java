// Last updated: 8/14/2025, 3:49:49 PM

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
       int left=0;
        int rig=n-1;
        int m=0;
        int w=0;
        while(left<rig){
            if(height[left]<height[rig]){
                
                w=height[left]*(rig-left);
                left++;
                if(w>m){
                    m=w;
                }
            }else{
                
                w=height[rig]*(rig-left);
                rig--;
                if(w>m){
                    m=w;
                }
            }
           
        }
         return m;


    }}  
        
  
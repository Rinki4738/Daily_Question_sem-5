// Last updated: 8/26/2025, 9:13:33 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans=0;
        int maxprev=0;
        for(int i=0;i<dimensions.length;i++){
           int  dsquare=dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1];
            if(dsquare>maxprev){
                maxprev=dsquare;
                ans=dimensions[i][0]*+dimensions[i][1];
            }
            else if(dsquare==maxprev){
                if(dimensions[i][0]*+dimensions[i][1]>ans)
                ans=dimensions[i][0]*+dimensions[i][1];
            }
        }
        return ans;
        
    }
}
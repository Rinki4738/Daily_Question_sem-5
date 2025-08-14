// Last updated: 8/14/2025, 3:41:09 PM
class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int lowerbound=bounds[0][0];
        int upperbound=bounds[0][1];
        int prevdiff=0;
        for(int i=1;i<original.length;i++){
            int diff=original[i]-original[i-1];
            diff+=prevdiff;
            lowerbound=Math.max(lowerbound,bounds[i][0]-diff);
            upperbound=Math.min(upperbound,bounds[i][1]-diff);
            prevdiff=diff;
        }
        int result=upperbound-lowerbound+1;
        return result<0?0:result;
        
    }
}
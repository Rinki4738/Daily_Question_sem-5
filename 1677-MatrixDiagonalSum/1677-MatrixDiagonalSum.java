// Last updated: 8/14/2025, 3:43:07 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j||i+j==mat.length-1){
                    s+=mat[i][j];
                }
            }
        }
        return s;
        
    }
}
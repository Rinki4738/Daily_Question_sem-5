// Last updated: 8/14/2025, 3:46:53 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int item=target;
        int col=matrix[0].length-1;
        while(r<matrix.length && col>=0){
            if(matrix[r][col]==item){
                return true;
            }else if(matrix[r][col]>item){
                col--;

            }else{
                r++;
            }
        }
        return false;
        
    }
}
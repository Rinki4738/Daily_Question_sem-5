// Last updated: 8/14/2025, 3:44:37 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
       int a[][]=new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            a[i][j]=matrix[j][i];
        }
       }
       return a;
    }
}
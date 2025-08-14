// Last updated: 8/14/2025, 3:43:37 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j]<0){
                    c++;
                }else{
                    break;
                }
            }
        }
        return c;
        
    }
}
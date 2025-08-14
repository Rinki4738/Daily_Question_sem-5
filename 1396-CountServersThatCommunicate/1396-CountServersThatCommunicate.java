// Last updated: 8/14/2025, 3:43:40 PM
class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int row[]=new int[m];
        int col[]=new int[n];
      
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
              if(grid[i][j]==1){
                if(row[i]>1||col[j]>1){
                    c++;
                }
              }
            }
        }
        return c;
       
       

      
      
        
    }
}
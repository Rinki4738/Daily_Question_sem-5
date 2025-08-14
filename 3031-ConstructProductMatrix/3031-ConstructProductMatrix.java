// Last updated: 8/14/2025, 3:41:36 PM
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int nums[]=new int[n*m];
        int left[]=new int[n*m];
        int right[]=new int[n*m];
        int ind=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                nums[ind++]=grid[i][j]%12345;
                
            }
        }
        left[0]=1;
        right[n*m-1]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=(left[i-1]%12345*nums[i-1]%12345)%12345;
        }
         for(int i=n*m-2;i>=0;i--){
           right[i]=(right[i+1]%12345*nums[i+1]%12345)%12345;
        }int inx=0;
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
               grid[i][j]=(left[inx]%12345*right[inx]%12345)%12345;
               inx++;
                
            }
        }
       
        return grid;
    }}   
        
       
// Last updated: 8/14/2025, 3:41:35 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int freq[]=new int[grid.length*grid.length+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                freq[grid[i][j]]++;
            }
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]>1){
                ans[0]=i;
            }
            if(freq[i]==0){
                ans[1]=i;
            }
        }
        return ans;
        
    }
}
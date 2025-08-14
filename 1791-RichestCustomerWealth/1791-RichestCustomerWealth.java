// Last updated: 8/14/2025, 3:43:01 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int s=0;
            for(int j=0;j<accounts[0].length;j++){
            s+=accounts[i][j];
            }
            if(s>max)
            max=s;
        }
        return max;
    }
}
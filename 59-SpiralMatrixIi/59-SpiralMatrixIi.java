// Last updated: 8/14/2025, 3:48:50 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int a[][]=new int[n][n];
        int c=0;
        int t=n*n;
        int minc=0;
        int maxc=n-1;
        int maxr=n-1;
        int minr=0;
        while(c<t){
        
        for(int i=minc;i<=maxc && c<t;i++){
            a[minr][i]=c+1;
            c++;

        }
        minr++;
        for(int i=minr;i<=maxr && c<t;i++){
            a[i][maxc]=c+1;
            c++;
        }
        maxc--;
        for(int i=maxc;i>=minc && c<t;i--){
            a[maxr][i]=c+1;
            c++;
        }
        maxr--;
        for(int i=maxr;i>=minr && c<t;i--){
            a[i][minc]=c+1;
            c++;
        }
        minc++;
        }
        return a;
        
    }
}
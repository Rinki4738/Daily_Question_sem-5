// Last updated: 8/29/2025, 7:31:13 PM
class Solution {
    public long flowerGame(int n, int m) {
        int ne=n/2;
        int no=n-ne;
        int me=m/2;
        int mo=m-me;
        return 1L*ne*mo+1L*no*me;
        
        
    }
}
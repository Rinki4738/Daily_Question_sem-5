// Last updated: 8/14/2025, 3:49:52 PM
class Solution {
    public int reverse(int x) {
       long mul=1;
        if(x<0){
            x=x*-1;
            mul=-1;
        }
        
        long rev=0;
        while(x>0){
            int r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)(rev*mul);
        
    }
}
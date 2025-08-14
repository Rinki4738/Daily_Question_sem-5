// Last updated: 8/14/2025, 3:47:27 PM
class Solution {
    public int trailingZeroes(int n) {
        return primefact(n);
    }
     public static int primefact(int n) {
		 int s=0,d=0	;
		 while(n>=5) {
			  d=n/5;
			 s=s+d;
			 n=d;
		 }
		 return s;
			
	 }
}
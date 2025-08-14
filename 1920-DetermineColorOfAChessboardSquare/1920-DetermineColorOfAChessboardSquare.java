// Last updated: 8/14/2025, 3:42:39 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=(coordinates.charAt(0))-96;
        int b=coordinates.charAt(1)-48;
      //  System.out.print(a);
        return ((a+b)%2!=0);
        
    }
}
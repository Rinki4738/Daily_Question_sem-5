// Last updated: 8/14/2025, 3:46:48 PM
class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return num%9==0?9:num%9;
        
    }
}
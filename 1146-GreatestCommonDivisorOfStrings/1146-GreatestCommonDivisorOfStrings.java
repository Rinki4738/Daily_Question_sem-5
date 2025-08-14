// Last updated: 8/14/2025, 3:43:58 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int dividend=str1.length();
        int divisor=str2.length();
        while((dividend%divisor)>0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;

        }
        return str1.substring(0,divisor);
        
    }
}
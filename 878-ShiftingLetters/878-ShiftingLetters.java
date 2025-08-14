// Last updated: 8/14/2025, 3:44:40 PM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        int sum[]=new int[n];
        sum[n-1]=shifts[n-1]%26;
        for(int i=n-2;i>=0;i--){
            sum[i]=(sum[i+1]+shifts[i])%26;
        }String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)+sum[i]<=122){
            res+=(char)((s.charAt(i)+sum[i]));}
            else{
              res+=(char) (96+((s.charAt(i)+sum[i])-122));
            }
        }
        return res;
    }
}
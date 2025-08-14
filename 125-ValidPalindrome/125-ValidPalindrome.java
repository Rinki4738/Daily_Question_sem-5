// Last updated: 8/14/2025, 3:47:55 PM
class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                a+=s.charAt(i);
            }else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                a+=(char)(s.charAt(i)+32);
            }else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                a+=s.charAt(i);
            }
        }
       // System.out.println(a);
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
        
    }
}
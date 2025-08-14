// Last updated: 8/14/2025, 3:43:52 PM
class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        StringBuilder sb=new StringBuilder(palindrome);
        int flag=0;
        int ans=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='a'){
               flag=1;
                char ch=sb.charAt(i);
                sb.deleteCharAt(i);
                sb.insert(i,'a');
                if(!ispallindrome(sb)){
                     ans=1;
                    return sb.toString();
                }
                else{
                 sb.deleteCharAt(i);
                    sb.insert(i,ch);
                }
            }

        }if(flag==0||ans==0){
            sb.deleteCharAt(palindrome.length()-1);
            sb.insert(palindrome.length()-1,'b');
        }
        
        return sb.toString();
       
        
    }
    public static boolean ispallindrome(StringBuilder a){
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
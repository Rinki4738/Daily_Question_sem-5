// Last updated: 8/14/2025, 3:41:22 PM
class Solution {
    public char kthCharacter(int k) {
       StringBuilder sb=new StringBuilder() ;
       sb=func(k);
    //    System.out.println(sb);
       return sb.charAt(k-1);

        
    }
    public static StringBuilder func(int k){
        if(k==0){
            StringBuilder a=new StringBuilder();
            a.append("a");
            return a;
        }
       
        StringBuilder a=func(k-1);
        if(a.length()>=k){
            return a;
        }
       StringBuilder sb=new StringBuilder(a);
        for(int i=0;i<a.length();i++){
            sb.append((char)(a.charAt(i)+1));

        }
        return sb;
}}
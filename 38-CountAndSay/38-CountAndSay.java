// Last updated: 8/14/2025, 3:49:18 PM
class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String a="11";
        while(n>2){
            
            a=compress(a);
            n--;
        }
        return a;
        
    }
    public static String compress(String s){
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
            else{
                c++;
                sb.append(""+c);
                sb.append(s.charAt(i));
                c=0;

            }
        }
        c++;
      sb.append(""+c);
       sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}
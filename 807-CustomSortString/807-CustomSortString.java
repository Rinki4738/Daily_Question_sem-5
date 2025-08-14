// Last updated: 8/14/2025, 3:44:48 PM
class Solution {
    public String customSortString(String order, String s) {
       int a[]=new int[26];
       int b[]=new int[26];
       for(int i=0;i<order.length();i++){
        a[order.charAt(i)-97]++;
       }
       for(int i=0;i<s.length();i++){
        b[s.charAt(i)-97]++;
       }String r="";
       String p="";
       for(int i=0;i<order.length();i++){
        if(b[order.charAt(i)-97]>0){
            r+=order.charAt(i);

        }
       }
       for(int i=0;i<s.length();i++){
        if(a[s.charAt(i)-97]==0){
            p+=s.charAt(i);

        }
       }
        String res="";
     for(int i=0;i<r.length();i++){
       for(int j=0;j<b[r.charAt(i)-97];j++){
        res+=r.charAt(i);
       }
     }
     return res+p;
        
    }
}
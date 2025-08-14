// Last updated: 8/14/2025, 3:45:32 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length()){
        return false;
       }
       int a[]=new int[26];
       int b[]=new int[26];
       for(int i=0;i<s1.length();i++){
        a[s1.charAt(i)-97]++;
        b[s2.charAt(i)-97]++;
       }
       if(Arrays.equals(a,b)){
        return true;
       }
       for(int i=s1.length();i<s2.length();i++){
        b[s2.charAt(i-s1.length())-97]--;
        b[s2.charAt(i)-97]++;
        if(Arrays.equals(a,b)){
            return true;
       }
       }return false;


       
    
        

    }
}
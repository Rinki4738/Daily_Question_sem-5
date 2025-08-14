// Last updated: 8/14/2025, 3:46:19 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int a[]=new int[26];
       int b[]=new int[26];
       for(int i=0;i<ransomNote.length();i++){
        a[ransomNote.charAt(i)-97]++;
       }
        for(int i=0;i<magazine.length();i++){
        b[magazine.charAt(i)-97]++;
       }
      for(int i=0;i<a.length;i++){
        if(a[i]!=0 && a[i]>b[i]){
            return false;

        }
      }return true;
        
    }
}
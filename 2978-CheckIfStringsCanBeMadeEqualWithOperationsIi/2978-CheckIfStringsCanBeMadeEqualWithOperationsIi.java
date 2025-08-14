// Last updated: 8/14/2025, 3:41:38 PM
class Solution {
    public boolean checkStrings(String s1, String s2) {
        int feven1[]=new int[26];
        int fodd1[]=new int[26];
        int feven2[]=new int[26];
        int fodd2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            if(i%2==0){  
                feven1[s1.charAt(i)-'a']++;}
            else{
                fodd1[s1.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<s2.length();i++){
            if(i%2==0){
            feven2[s2.charAt(i)-'a']++;}
            else{
                fodd2[s2.charAt(i)-'a']++;
            }
        }
        if(Arrays.equals(feven1,feven2) && Arrays.equals(fodd1,fodd2)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
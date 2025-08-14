// Last updated: 8/14/2025, 3:43:17 PM
class Solution {
    public int numSplits(String s) {
        int c=0;
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        freq1[s.charAt(0)-'a']++;
        for(int i=1;i<s.length();i++){
            freq2[s.charAt(i)-'a']++;
        }
        if(uniquecount(freq1,freq2)){
            c++;
        }
        for(int i=1;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']--;
            if(uniquecount(freq1,freq2)){
                c++;
            }
        }
        return c;

        

        
    }
    public static boolean uniquecount(int freq1[],int freq2[]){
        int c=0;
        int d=0;
        for(int i=0;i<26;i++){
            if(freq1[i]!=0){
                c++;
            }
            if(freq2[i]!=0){
                d++;
            }
        }
        if(c==d){
            return true;
        }
        return false;
       
    }
   
}
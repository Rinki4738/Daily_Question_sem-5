// Last updated: 8/14/2025, 3:47:17 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            else{
               if(t.charAt(i)!=map.get(s.charAt(i))){
                return false;
               }
            }
        }
        
         HashMap<Character,Character> mp=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(!mp.containsKey(t.charAt(i))){
                mp.put(t.charAt(i),s.charAt(i));
            }
            else{
               if(s.charAt(i)!=mp.get(t.charAt(i))){
                return false;
               }
            }
        }
        return true;
        
        
    }
}
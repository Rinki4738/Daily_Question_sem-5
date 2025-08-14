// Last updated: 8/14/2025, 3:41:13 PM
class Solution {
    public String findValidPair(String s) {
       String ans="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int count = map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) : 0;
            map.put(s.charAt(i), count + 1);
            
        }
       // System.out.print(map);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                int n=s.charAt(i)-48;
                int n2=s.charAt(i+1)-48;
                if(map.get(s.charAt(i))==n && map.get(s.charAt(i+1))==n2 ){
                   ans=""+s.charAt(i)+s.charAt(i+1);
                    return ans;
                }
            }
        }
        return ans;
        
        
    }
}
// Last updated: 8/30/2025, 6:51:34 PM
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        char ch='a';
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' '){
                continue;
            }
            if(!map.containsKey(key.charAt(i))){
            map.put(key.charAt(i),ch);
            ch++;
            }
        }
       
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                sb.append(' ');
            }
            else
            sb.append(map.get(message.charAt(i)));}
            
        
        return sb.toString();

        
    }
}
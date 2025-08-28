// Last updated: 8/28/2025, 11:20:25 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> ans=new ArrayList<>();

            HashMap<String,List<String>> map= new HashMap<>();
            for(int i=0;i<strs.length;i++){
                String key=GetKey(strs[i]);
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);}
            for(String a:map.keySet()){
                ans.add(map.get(a));
            }
            return ans;
        
    }
    public static String GetKey(String s){
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append(freq[i]+" ");
        }
        return sb.toString();

    }
}
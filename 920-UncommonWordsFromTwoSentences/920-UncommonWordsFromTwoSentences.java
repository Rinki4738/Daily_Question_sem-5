// Last updated: 8/14/2025, 3:44:29 PM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
    String s=s1+" "+s2;
      String words[]=s.split("\s");
    HashMap<String,Integer> map=new HashMap<>();
    for(int i=0;i<words.length;i++){
        map.put(words[i],map.getOrDefault(words[i],0)+1);
    }
   String ans[]=new String[s.length()];
   int idx=0;
    for(String ele:map.keySet()){
        if(map.get(ele)==1){
            ans[idx++]=ele;
        }
    }
    return Arrays.copyOfRange(ans,0,idx);

      

        
    }
}
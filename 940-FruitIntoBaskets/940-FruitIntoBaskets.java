// Last updated: 8/14/2025, 3:44:26 PM
import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
      HashMap<Integer,Integer> map=new HashMap<>();
      
      int max=0;
      int l=0;
      for(int i=0;i<fruits.length;i++){
        if(!map.containsKey(fruits[i])){
        map.put(fruits[i],1);
        }

        else{
            int c=map.get(fruits[i]);
            map.put(fruits[i],++c);
        }
        
        while(map.size()>2){
            int k=map.get(fruits[l]);
            map.put(fruits[l],--k);
            if(map.get(fruits[l])==0){
             map.remove(fruits[l]);}
             l++;


        }
        max=Math.max(i-l+1,max);
        }

        return max;
      }

}
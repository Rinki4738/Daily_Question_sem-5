// Last updated: 8/14/2025, 3:47:20 PM
class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
       // int a=n;
        while(n>1){
            if(!map.containsKey(n)){
                map.put(n,1);
            }
            else{
                return false;
            }
            int s=0;
            while(n>0){
                int r=n%10;
                s+=r*r;
                n=n/10;
            }
            n=s;
           
            
        }
      //  System.out.println(map);
        return true;
        
    }
}
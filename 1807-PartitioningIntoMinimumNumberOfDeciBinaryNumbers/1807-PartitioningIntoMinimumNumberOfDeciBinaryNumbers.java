// Last updated: 8/14/2025, 3:42:56 PM
class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            int a=n.charAt(i)-48;
            if(a>max){
                max=a;
            }
        }
        return max;
       
        
    }
}
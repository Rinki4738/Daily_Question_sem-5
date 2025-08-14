// Last updated: 8/14/2025, 3:45:09 PM
class Solution {
    public int repeatedStringMatch(String a, String b) {
       
        int times=b.length()/a.length();
        times+=2;
        StringBuilder sb=new StringBuilder();
        int c=0;
        while(c<times){
            sb.append(a);
            c++;
            if(sb.length()>=b.length() && sb.toString().contains(b)){
                return c;
            }
            

        }
        return -1;
        
    }
}
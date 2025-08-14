// Last updated: 8/14/2025, 3:45:52 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l=s.length();
        for(int i=l/2;i>=1;i--){
            if(l%i==0){
                int times=l/i;
                String a=s.substring(0,i);
                StringBuilder sb=new StringBuilder();
                while(times-->0){
                    sb.append(a);
                }
                if(sb.toString().equals(s))
                return true;
            }
        }
        return false;
        
    }
}
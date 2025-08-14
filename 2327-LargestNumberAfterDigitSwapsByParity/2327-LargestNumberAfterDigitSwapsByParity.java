// Last updated: 8/14/2025, 3:42:09 PM
class Solution {
    public int largestInteger(int num) {
        char ch[]=(""+num).toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                int d=ch[i]-'0';
                int d2=ch[j]-'0';
                if(d2>d && (d2-d)%2==0){
                    char t=ch[i];
                    ch[i]=ch[j];
                    ch[j]=t;
                }
            }
        }
       return Integer.parseInt(new String(ch));
        
        
    }
}
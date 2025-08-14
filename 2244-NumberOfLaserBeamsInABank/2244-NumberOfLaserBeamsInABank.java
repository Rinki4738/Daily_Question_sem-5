// Last updated: 8/14/2025, 3:42:15 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int a[]=new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int c=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    c++;
                }
            }
            a[i]=c;
           
        } int s=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]!=0){
                    s+=a[i]*a[j];
                    break;
                }
            }
        }
        return s;


        
    }
}
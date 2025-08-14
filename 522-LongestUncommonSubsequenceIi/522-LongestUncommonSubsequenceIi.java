// Last updated: 8/14/2025, 3:45:41 PM
class Solution {
    public int findLUSlength(String[] strs) {
        int ans=-1;
       for(int i=0;i<strs.length;i++){
        int flag=0;
        for(int j=0;j<strs.length;j++){
            if( j!=i && issubsequence(strs[i],strs[j])){
                flag=1;
                break;

            }
        }
        if(flag==0){
            ans=Math.max(ans,strs[i].length());
        }
       }
       return ans;
    }public static boolean issubsequence(String a,String b){
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==a.length())
        return true;
        return false;
    }
}
// Last updated: 8/14/2025, 3:42:17 PM
class Solution {
    public boolean checkString(String s) {
        int idx=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            return true;

        }
        System.out.println(idx);
        for(int i=idx+1;i<s.length();i++){
            if(s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}
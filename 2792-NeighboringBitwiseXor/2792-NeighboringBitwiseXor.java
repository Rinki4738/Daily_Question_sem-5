// Last updated: 8/14/2025, 3:41:39 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans=derived[0];
    for(int i=1;i<derived.length;i++){
       ans=ans^derived[i];
    }
    if(ans==0){
        return true;
    }
    return false;}}
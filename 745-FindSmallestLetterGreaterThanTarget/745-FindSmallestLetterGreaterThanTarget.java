// Last updated: 8/14/2025, 3:44:55 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo=0;
        int hi=letters.length-1;
      char ans=' ';
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }if(ans==' '){
            return letters[0];
        }
        return ans;
        
    }
}
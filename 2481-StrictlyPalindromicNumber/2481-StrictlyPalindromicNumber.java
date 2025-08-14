// Last updated: 8/14/2025, 3:42:02 PM
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int base=2;base<=n-2;base++){
            if(ispallindromic(n,base)==false){
                return false;
            }
        }
        return true;
        
    }
    public static boolean ispallindromic(int n,int base){
        ArrayList<Integer> ll=new ArrayList<>();
        while(n>1){
            int r=n%base;
            ll.add(r);
            n=n/base;
        }
        int i=0;
        int j=ll.size()-1;
        while(i<j){
            if(ll.get(i)!=ll.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return false;

    }
}
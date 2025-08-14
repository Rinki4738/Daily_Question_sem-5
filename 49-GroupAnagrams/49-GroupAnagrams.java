// Last updated: 8/14/2025, 3:49:06 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> a=new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        int num[]=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            if(num[i]==0){
            a.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(num[j]==0 && isAnagram(strs[i],strs[j])){
                    a.add(strs[j]);
                    num[j]++;
                }
            }
           // System.out.println(a);
            res.add(new ArrayList<>(a));
            a.clear();
           
        }}
        return res;
        
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char a[]=s.toCharArray();
         char b[]=t.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);
         return (Arrays.equals(a,b));

        
    }
}
// Last updated: 8/14/2025, 3:46:02 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         ArrayList<Integer> res=new ArrayList<>();
        if(p.length()>s.length()){
            return res;
        }
        int a[]=new int[26];
        int b[]=new int[26];
       
        for(int i=0;i<p.length();i++){
            a[p.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++){
            b[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b))
        res.add(0);
        for(int i=p.length();i<s.length();i++){
            b[s.charAt(i)-'a']++;
            b[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(a,b)){
                res.add(i-p.length()+1);
            }


        }
        return res;
    }
}
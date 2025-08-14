// Last updated: 8/14/2025, 3:41:56 PM
class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> temp= new HashSet<>();
        for(int ele:nums){
            temp.add(ele);
            int s=0;
            while(ele>0){
                int r=ele%10;
                s=s*10+r;
                ele=ele/10;
            }
            temp.add(s);
            
        }
        return temp.size();
        
    }
}
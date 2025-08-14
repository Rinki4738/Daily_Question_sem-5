// Last updated: 8/14/2025, 3:41:54 PM
class Solution {
    public int distinctAverages(int[] nums) {
       HashMap <Double,Integer> map=new HashMap<>();
        int c=0;
        Arrays.sort(nums);
        int i=0;int j=nums.length-1;
        while(i<j){
            double avg=(nums[i]+nums[j])/2.0;
            if(!map.containsKey(avg)){
                map.put(avg,1);
                c++;
            }
            
            i++;
            j--;
        }
        return c;
        
    }
}
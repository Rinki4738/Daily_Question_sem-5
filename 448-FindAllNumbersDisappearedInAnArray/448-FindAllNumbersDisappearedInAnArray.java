// Last updated: 8/14/2025, 3:45:54 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list=new ArrayList<Integer>();
        
        int a[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            a[nums[i]]++;
        }
        for(int i=1;i<a.length;i++){
            if(a[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}
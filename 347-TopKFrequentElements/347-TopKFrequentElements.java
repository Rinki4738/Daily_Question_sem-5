// Last updated: 8/14/2025, 3:46:31 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[nums.length];
        int q=0;
        int maxi=0;
        for(int j=0;j<k;j++){
            int max=0;
        for(int ele:map.keySet()){
           if(map.get(ele)>max){
            max=map.get(ele);
            maxi=ele;
           }
        }
        map.remove(maxi);
        ans[q++]=maxi;
        }
        return Arrays.copyOfRange(ans,0,q);
    }
}
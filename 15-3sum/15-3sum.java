// Last updated: 8/14/2025, 3:49:42 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){continue;}
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)j++;
                else if(sum>0) k--;
                else {
                    List<Integer>ll=new ArrayList<>();
                    ll.add(nums[i]);
                    ll.add(nums[j]);
                    ll.add(nums[k]);
                    ans.add(ll);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){j++;}

                }
               

        
                
            }
        }return ans;
        
    }
}
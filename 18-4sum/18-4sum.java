// Last updated: 8/14/2025, 3:49:38 PM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){continue;}
                int k=j+1;
                int m=nums.length-1;
                while(k<m){
                    long sum= 1L*nums[i]+nums[j]+nums[k]+nums[m];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        m--;
                    }
                    else{
                        List<Integer> ll=new ArrayList<>();
                        ll.add(nums[i]);
                        ll.add(nums[j]);
                        ll.add(nums[k]);
                        ll.add(nums[m]);
                        ans.add(ll);
                        k++;
                        m--;
                        while(k<m && nums[k]==nums[k-1]){k++;}
                        while (k < m && nums[m] == nums[m + 1]) m--;
                        
                    }
                }
            }
        }
        return ans;
        
    }
}
// Last updated: 8/14/2025, 3:41:44 PM
class Solution {
    public long[] distance(int[] nums) {

       
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

       
        long[] res = new long[nums.length];

        
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> list = entry.getValue();
            int size = list.size();

          
            if (size == 1) {
                res[list.get(0)] = 0;
                continue;
            }

           
            long[] left = new long[size];
            long[] right = new long[size];

          
            for (int j = 1; j < size; j++) {
                left[j] = left[j - 1] + (long) (list.get(j) - list.get(j - 1)) * j;
            }

            for (int j = size - 2; j >= 0; j--) {
                right[j] = right[j + 1] + (long) (list.get(j + 1) - list.get(j)) * (size - 1 - j);
            }

            for (int j = 0; j < size; j++) {
                res[list.get(j)] = left[j] + right[j];
            }
        }

        return res;
    }
}

        
   
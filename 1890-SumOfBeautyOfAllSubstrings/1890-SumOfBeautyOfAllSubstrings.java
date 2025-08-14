// Last updated: 8/14/2025, 3:42:43 PM
class Solution {
    public int beautySum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                int mx = Integer.MIN_VALUE;
                int mn = Integer.MAX_VALUE;

                for (int freq : map.values()) {
                    mx = Math.max(mx, freq);
                    mn = Math.min(mn, freq);
                }

                sum += mx - mn;
            }
        }

        return sum;
    }
}
 
 
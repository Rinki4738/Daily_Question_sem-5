# Last updated: 8/14/2025, 3:50:03 PM
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        m=0
        for i in range(len(s)):
            a=""
            for j in range(i,len(s)):
                if s[j] not in a:
                    a+=s[j]
                else:
                    a=""
                    break
                if len(a)>m:
                    m=len(a)
        return m

        
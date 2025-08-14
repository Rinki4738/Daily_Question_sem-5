# Last updated: 8/14/2025, 3:50:01 PM
class Solution:
    def longestPalindrome(self, s: str) -> str:
        k=""
        for i in range(len(s)):
            for j in range(i,len(s)):
                if s[i:j+1]==s[i:j+1][::-1]:
                    if len(s[i:j+1])>len(k):
                        k=s[i:j+1]
        return k


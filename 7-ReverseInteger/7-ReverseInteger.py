# Last updated: 8/14/2025, 3:49:57 PM
class Solution:
    def reverse(self, x: int) -> int:
        a=str(x)
        if x>=0:
            a=a[::-1]
            a=int(a)
        else:
            
            a=a[1::]
            a=a[::-1]
            a=int(a)*-1
        if a>=-2**31 and a<=2**31-1:
            return a
        else:
            return 0
        

        
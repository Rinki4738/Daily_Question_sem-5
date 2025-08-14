// Last updated: 8/14/2025, 3:42:30 PM
class Solution {
    public int countGoodNumbers(long n) {
        long MOD = (long)(1e9 + 7);
        long oddplaces = n / 2;
        long evenplaces = n - oddplaces;

        long o = power(4, oddplaces, MOD);
        long e = power(5, evenplaces, MOD);

        long mul = (o % MOD * e % MOD) % MOD;
        return (int) mul;
    }

    public static long power(int base, long p, long MOD) {
        if (p == 0) {
            return 1;
        }
        long half = power(base, p / 2, MOD);
        long result = (half * half) % MOD;
        if (p % 2 == 1) {
            result = (result * base) % MOD;
        }
        return result;
    }
}

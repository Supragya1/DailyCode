class Solution {
public:
    int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }

        vector<int> ugly_num(n, 0);
        ugly_num[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;

        for (int i = 1; i < n; ++i) {
            ugly_num[i] = min({ugly_num[p2] * 2, ugly_num[p3] * 3, ugly_num[p5] * 5});
            
            if (ugly_num[i] == ugly_num[p2] * 2) ++p2;
            if (ugly_num[i] == ugly_num[p3] * 3) ++p3;
            if (ugly_num[i] == ugly_num[p5] * 5) ++p5;
        }

        return ugly_num[n - 1];
    }
};
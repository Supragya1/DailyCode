class Solution {
public:
    int numberOfSequence(int n, vector<int>& sick) {
        const int mod = 1e9 + 7;

        vector<int> len_wo_sick;
        vector<bool> mark(n, 0); 

        for (auto i : sick) {
            mark[i] = 1;
        }

        for (int i = 0, cur = 0; i < n; i++) {
            if (!mark[i]) {
                cur++;
            }
            if (!mark[i] && (i == n - 1 || mark[i + 1])) {
                len_wo_sick.push_back(cur);
                cur = 0;
            }
        }

        auto mult = [&](int mark, int b) {
            return (1LL * mark * b) % mod;
        };
        auto modexp = [&](int mark, int b) {
            int r = 1;
            while (b) {
                if (b & 1) {
                    r = mult(r, mark);
                }
                mark = mult(mark, mark);
                b >>= 1;
            }
            return r;
        };
        auto inverse = [&](int x) {
            return modexp(x, mod - 2);
        };

        vector<int> pow2(n + 1);
        pow2[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow2[i] = mult(pow2[i - 1], 2);
        }
        vector<int> fac(n + 1);
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = mult(fac[i - 1], i);
        }

        int Y = n - sick.size();
        int A = 0, B = 0;

        if (sick.front() != 0) {
            A = len_wo_sick.front();
            len_wo_sick.erase(len_wo_sick.begin());
        }
        if (sick.back() != n - 1) {
            B = len_wo_sick.back();
            len_wo_sick.pop_back();
        }

        int ans = fac[Y];

        for (int x : len_wo_sick) {
            ans = mult(ans, inverse(fac[x]));
            ans = mult(ans, pow2[x - 1]);
        }
        ans = mult(ans, inverse(fac[A]));
        ans = mult(ans, inverse(fac[B]));

        return ans;
    }
};


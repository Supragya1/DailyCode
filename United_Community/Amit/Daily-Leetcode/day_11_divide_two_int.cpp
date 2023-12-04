class Solution {
public:
    int divide(int dividend, int divisor) {
        if (dividend == INT_MIN && divisor == -1) return INT_MAX;
        if (dividend == INT_MIN && divisor == 1) return INT_MIN;

        long divid = abs(dividend), divis = abs(divisor);

        int quo = 0;
        while (divis <= divid) {
            long temp = divis, i = 1;
            while (temp <= divid - temp) {
                temp <<= 1;
                i <<= 1;
            }
            quo += i;
            divid -= temp;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            return -quo;
        } else {
            return quo;
        }
    }
};

// https://leetcode.com/problems/count-the-number-of-infection-sequences/


class Solution {
    // https://www.notion.so/day_23-e5be3191466249a9b654a493e21d14af?pvs=4

    // In the Question it is said to give the ans in multiply of this number
    private int MOD = (int) Math.pow(10, 9) + 7;

    public int numberOfSequence(int n, int[] sick) {
        List<Integer> segments = new ArrayList<>();
        // by Hint 2
        // storing the length of the first and last segment 
        int startSegmentLen = sick[0];
        int endSegmentLen = n - sick[sick.length - 1] - 1;

        // Hint 3 (2 ^ size of segments) is the number of ways for segments other than the first and last
        for (int i = 1; i < sick.length; i++) {
            if (sick[i] - sick[i-1] - 1 > 0) {
                // getting the length of the segments which are not the first and the last one
                segments.add(sick[i] - sick[i-1] - 1);
            }
            // System.out.println(segments);
        }
        /* 
        "(Hint - 5)"
        The answer is: S! / (len[1]! * len[2]! * ... * len[m]!) * 2k where len[1], len[2], ..., len[m]
        are the lengths of each segment of non-infected children that have an infected child at both
        endpoints, S is the total length of all segments of non-infected children, and k = (len[1] - 1)
        + (len[2] - 1) + ... + (len[m] - 1).
        */
        int[] fac = Factorial(n);
        int[] pow2 = Pow2(n);

        int totalNotSick = n - sick.length;

        int ans = fac[totalNotSick]; // S!

        ans = multiply(ans, inverse(fac[startSegmentLen])); // the dinome part
        ans = multiply(ans, inverse(fac[endSegmentLen])); // the dimone part

        for (int segment : segments) {
            ans = multiply(ans, pow2[segment - 1]); // this is K
            ans = multiply(ans, inverse(fac[segment])); // the denome part
        }

        return ans;
    }
    //----------- Functions ------------//
    private int inverse(int n) {
        return exp(n, MOD - 2);
    }

    // this function finds the base^exp using the binary method
    private int exp(int base, int exp) {
        int res = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = multiply(res, base);
            }
            base = multiply(base, base);
            exp /= 2;
        }
        return res;
    }

    private int multiply(int a, int b) {
        return (int) ((1L * a * b) % MOD);
        // 1L to make force the multiply into long so we can handle the overflow
        // and then take mod with MOD
    }

    private int[] Pow2(int n) {
        // Finding the power of 2 of all the digits from 0 to n
        // as we will need it in the formula (Hint 5)
        int[] pow2 = new int[n + 1];
        pow2[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow2[i] = multiply(pow2[i - 1], 2);
        }
        return pow2;
    }

    private int[] Factorial(int n) {
        // Finding the factorial of all the digits from 0 to n
        // as we will need it in the formula (Hint 5)
        int[] fac = new int[n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = multiply(fac[i - 1], i);
        }
        return fac;        
    }
}
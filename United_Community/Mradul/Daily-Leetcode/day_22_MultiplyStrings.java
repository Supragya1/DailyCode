// https://leetcode.com/problems/multiply-strings/


class Solution {
    public String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            int n1 = (int)(num1.charAt(i) - '0');
            int carry = 0;

            for (int j = num2.length() - 1; j >= 0; j--) {
                int n2 = (int)(num2.charAt(j) - '0');
                int sum = (n1 * n2) + result[i + j + 1] + carry;
                result[i + j + 1] = sum%10;
                carry = sum/10;
            }
            result[i] += carry;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(num == 0 && sb.length() == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
// https://leetcode.com/problems/zigzag-conversion/


class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        StringBuilder[] str = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            str[i] = new StringBuilder("");
        }

        int i = 0;
        while (i < n) {
            // gething the vertical down
            for (int j = 0; j < numRows && i < n; j++) {
                str[j].append(s.charAt(i));
                i++;
            }
            // the digonal one 
            for (int j = numRows - 2; j > 0 && i < n; j--) {
                str[j].append(s.charAt(i));
                i++;
            }
        }
        StringBuilder zi = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            zi.append(str[j]);
        }

        return zi.toString();
    }
}
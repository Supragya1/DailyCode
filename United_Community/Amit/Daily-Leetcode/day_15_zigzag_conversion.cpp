class Solution {
public:
    string convert(string s, int numRows) {
        //cols diff = numRows - 2;
        //0, numRows + numRows - 2, lastTerm + 2*numRows - 2
                
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        
        string result(s.length(), ' ');
        int index = 0;
        int cols_diff = 2 * (numRows - 1);
        
        for (int i = 0; i < numRows; ++i) {
            for (int j = i; j < s.length(); j += cols_diff) {
                result[index++] = s[j];
                if (i != 0 && i != numRows - 1) {
                    int mid = j + cols_diff - 2 * i;
                    if (mid < s.length()) {
                        result[index++] = s[mid];
                    }
                }
            }
        }
        return result;
    }
};
class Solution {
public:
    bool isValid(std::string s) {
        int in = 0;
        
        for (char ch : s) {
            if (ch == '[' || ch == '(' || ch == '{') {
                s[in++] = ch;
            } else if (in == 0) {
                return false;
            } else if ((ch == ']' && s[in - 1] == '[') || 
                       (ch == '}' && s[in - 1] == '{') || 
                       (ch == ')' && s[in - 1] == '(')) {
                in--;
            } else {
                return false;
            }
        }
        
        return in == 0;
    }
};
// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        int in = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '[' || ch[i] == '(' || ch[i] == '{') {
                ch[in++] = ch[i];
            }
            else if  (in == 0) {
                return false;
            }
            else if ((ch[i] == ']' && ch[in-1] == '[') || (ch[i] == '}' && ch[in-1] == '{') || (ch[i] == ')' && ch[in-1] == '(')) {
                in--;
            } 
            else {
                return false;
            }
        }
        return in==0;
    }
}
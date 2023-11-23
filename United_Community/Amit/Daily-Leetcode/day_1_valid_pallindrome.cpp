class Solution {
public:
    bool alph_num_chec(char c) {
    return (c >= 'a' && c <= 'z') ||
           (c >= 'A' && c <= 'Z') ||
           (c >= '0' && c <= '9');
}

    bool isPalindrome(string s) {
    int left = 0, right = s.length() - 1;

    while (left < right) {
        char l_char = tolower(s[left]);
        char r_char = tolower(s[right]);

        while (!alph_num_chec(l_char) && (left < right)) {
            left++;
            l_char = tolower(s[left]);
        }

        while (!alph_num_chec(r_char) && (left < right)) {
            right--;
            r_char = tolower(s[right]);
        }

        if (l_char != r_char) {
            return false;
        }

        left++;
        right--;
    }
    return true;
}
};

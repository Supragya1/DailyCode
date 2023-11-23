class Solution {
public:
    bool isPalindrome(int x) {
        long reverse = 0, num_dig, temp;
        temp = x;
        while (x > 0) {
            num_dig = x%10;
            reverse = reverse*10 + num_dig;
            x/=10;
        }

        if (reverse == temp) {
            return true;
        }
        else {
            return false;
        }
    }
};
// https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        long sum = 0;
        int temp = x;
        while(temp != 0){
            sum = 10*sum + temp%10;
            temp /= 10;
        }
        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
            return 0;
        }
        return (int)sum;
    }
}
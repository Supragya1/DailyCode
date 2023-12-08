// https://leetcode.com/problems/count-and-say/


class Solution {
    public String countAndSay(int n) {
        if (n ==  1) {
            return "1"; // condition for recursion
        }
        return (say(countAndSay(n-1))); // calling function inside a function
    }

    public static String say (String say) {
        int len = say.length(), count;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < len; i++) {
            count = 1;
            while (i < len - 1 && say.charAt(i) == say.charAt(i+1)) { //geting the count
                count++;
                i++;
            }
            sb.append(count).append(say.charAt(i)); // adding the count and the cahr
        }
        return sb.toString(); // out put what will thr string will be said as
    }
}
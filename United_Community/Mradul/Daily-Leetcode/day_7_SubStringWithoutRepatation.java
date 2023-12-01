// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Check if the input string is empty
        if (s.equals("")) {
            return 0;
        }

        int max = 0;
        int[] lastIndex = new int[256]; // Assuming ASCII characters

        for (int i = 0, j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);

            // If the character is already seen, update the starting index
            i = Math.max(lastIndex[currentChar], i);

            max = Math.max(max, j - i + 1);
            lastIndex[currentChar] = j + 1;
        }

        return max;
    }
}

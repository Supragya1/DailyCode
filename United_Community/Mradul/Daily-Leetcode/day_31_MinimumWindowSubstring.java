// https://leetcode.com/problems/minimum-window-substring/


class Solution {
    /* Approach: 
     *  take the frequency of t
     *  compare it in the window 
     *  if it works, it can find the minimum one among them
    */
    // https://www.notion.so/day_31-c327268498904e409f8fa5d08792bbb8?pvs=4
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        // the start and end of the window
        int start = 0, end = 0;
        // we will use an in-Built Constructor to make the String which is the same as s
        int minlen = Integer.MAX_VALUE, startIndex = 0; 
        // we will use this to keep count of stuff which is passed and check for the smallest one
        int count = t.length(); 
        // we will use this to map (get the frequency in t)
        int[] map = new int[128]; 

        for (char c : t.toCharArray()) { // mapping (getting freq of the t)
            map[c]++; 
        }

        while (end < s.length()) { 
            // this will cheak if the element Exist it will remove form the count
            if (map[s.charAt(end)] > 0) {
                count--; // Decrese the count
            }

            // this will remove the freq if it had it 
            // else this will make it negative 
            map[s.charAt(end)]--;   
                                    
            end++;

            // if count == 0 (chaek for the min-len)
            while (count == 0) {

                // if this is the min-len update it
                if (end - start < minlen) {
                    startIndex = start;
                    minlen = end - start;
                }

                // if the start index hase the freq '0' 
                // i.e it was not turned negative so increment the count 
                if (map[s.charAt(start)] == 0) {
                    count++;
                }
                
                // normaly it will re set the necative freq
                // to check for the window
                map[s.charAt(start)]++;
                // incrremnt in start to next intartion
                start++;
            }
            // end++;
        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minlen);
    }
}

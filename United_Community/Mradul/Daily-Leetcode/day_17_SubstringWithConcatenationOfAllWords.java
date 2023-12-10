// https://leetcode.com/problems/substring-with-concatenation-of-all-words/


class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if (words[0].length() * words.length > s.length()) {
            return new ArrayList<>();
        }
        
        // we will use the Window approch
        Map<String, Integer> wordFreq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // this loop is finging the frequency of the woeds
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        String[] substrings = new String[s.length()];

        for (int i = 0; i < wordLen; i++) {
            Map<String, Integer> freq = new HashMap<>(); // for storing the freq of the Window
            int start = i, size = 0;// if (Size == Word.length) this allow us to chaek for freq.equal(Word_freq)

            for (int j = i; j <= s.length() - wordLen; j += wordLen) {
                substrings[j] = s.substring(j, j + wordLen); // window

                if (wordFreq.containsKey(substrings[j])) {
                    
                    start = (start == -1) ? j : start; // start=-1 means a new window needs to be started
                    freq.put(substrings[j], freq.getOrDefault(substrings[j], 0) + 1);
                    size++;

                    if (size == words.length) {
                        if (freq.equals(wordFreq)) {
                            result.add(start);
                        }

                        // sliding the window

                        freq.put(substrings[start], freq.get(substrings[start]) - 1);
                        start += wordLen; // new starting index
                        size--;
                    }
                } 
                else {
                    // reset window
                    start = -1;
                    size = 0;
                    freq.clear();
                }
            }
        }
        return result;
    }
}

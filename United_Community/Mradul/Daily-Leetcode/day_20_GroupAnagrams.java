// https://leetcode.com/problems/group-anagrams/


public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> fans = new ArrayList<>();
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> freq = new HashMap<>();

            for (int j = 0; j < strs[i].length(); j++) {
                freq.put(strs[i].charAt(j), freq.getOrDefault(strs[i].charAt(j), 0) + 1);
            }

            if (map.containsKey(freq)) {
                map.get(freq).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(freq, list);
            }
        }

        fans.addAll(map.values());

        return fans;
    }
}
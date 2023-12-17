// https://leetcode.com/problems/top-k-frequent-elements/


class Solution {
    // https://www.notion.so/day_25-75b83d9ef80c4bfc8c350d0ed298a5da?pvs=4 
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        // geting the freq
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        // making it into a list 
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

        // sorting the list based on the frequency value
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());


        // list into array
        int[] ans = new int[k];
        for (int i = 0; i < k && i < list.size(); i++) {
            ans[i] = (list.get(i).getKey());
        }

        return ans;
    }
}
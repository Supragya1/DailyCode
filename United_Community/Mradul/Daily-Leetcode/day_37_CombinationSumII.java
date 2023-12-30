// https://leetcode.com/problems/combination-sum-ii/


class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, new ArrayList<>(), 0);

        return res;
    }

    public void backtrack(int[] arr, int key, List<Integer> templist, int start) {
        if (key == 0) {
            res.add(new ArrayList<>(templist));
            return;
        }
        else {
            for (int i = start; i < arr.length; i++) {
                if (arr[i] > key) {
                    return;
                }
                else if (i > start && arr[i] == arr[i-1]) {
                    return;
                }
                templist.add(arr[i]);
                backtrack(arr, key - arr[i], templist, i + 1);
                templist.remove(templist.size() - 1);
            }
        }
    }
}
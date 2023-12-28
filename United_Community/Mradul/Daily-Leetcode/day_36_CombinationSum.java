// https://leetcode.com/problems/combination-sum/


class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        backtrack(new ArrayList<>(), candidates, target, 0);

        return res;
    }

    private void backtrack(List<Integer> templist, int[] arr, int key, int start) {
        if (key < 0) {
            return;
        }
        else if (key == 0) {
            res.add(new ArrayList<>(templist));
            return;
        }
        else {
            for (int i = start; i < arr.length; i++) {
                templist.add(arr[i]);
                backtrack(templist, arr, key - arr[i], i);
                templist.remove(templist.size() - 1);
            }
        }
    }
}
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/


class Solution {
    // https://www.notion.so/day_28-5e7bccaf211f459c88443f478bf79952?pvs=4
    
    public int[] twoSum(int[] numbers, int target) {
        // for (int i = 0; i < numbers.length; i++) {
        //     for (int j = i+1; j < numbers.length; j++) {
        //         if (numbers[i] + numbers[j] == target) {
        //             return new int[]{i+1, j+1};
        //         }
        //     }
        // }
        int left = 0, rigth = numbers.length - 1;
        while (left < rigth) {
            if (numbers[left] + numbers[rigth] == target) {
                return new int[]{left + 1, rigth + 1};
            }
            else if (numbers[left] + numbers[rigth] > target) {
                rigth--;
            }
            else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
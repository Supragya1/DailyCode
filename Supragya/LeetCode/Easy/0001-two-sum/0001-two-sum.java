// Day106_Q1.java
// Using hashmap and Two pointer Approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int left=0;
        int right = n-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(left<=right){
            if(map.containsKey(target-nums[left])){
                return new int []{left,map.get(target-nums[left])};
            }
            map.put(nums[left],left);
            if(map.containsKey(target-nums[right])){
                return new int []{right,map.get(target-nums[right])};
            }
            map.put(nums[right],right);
                left++;
                right--;
        }
        return new int []{};
    }
}
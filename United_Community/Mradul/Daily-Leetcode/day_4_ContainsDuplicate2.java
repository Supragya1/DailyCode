//https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int arr[][] = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        for(int i=0;i<nums.length-1;i++){
            if(arr[i][0]==arr[i+1][0] && Math.abs(arr[i][1]-arr[i+1][1])<=k){
                return true;
            }
        }
        return false;
    }
}
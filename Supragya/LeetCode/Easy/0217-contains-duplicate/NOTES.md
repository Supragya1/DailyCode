}
// Using HashMap 2pointer approach  15 ms beats 37.56%
class Solution {
public boolean containsDuplicate(int[] nums) {
if(nums.length==1){
return false;
}
HashMap<Integer,Integer> map = new HashMap<>();
int left = 0,right = nums.length-1;
while(left<=right){
if(map.containsKey(nums[left])){
return true;
}
map.put(nums[left],1);
if(map.containsKey(nums[right]) && left!=right){
return true;
}
map.put(nums[right],1);
left++;
right--;
}
return false;
}
}
// Using HashMap simple  11ms beats 55.90%
class Solution {
public boolean containsDuplicate(int[] nums) {
HashMap<Integer,Integer> map = new HashMap<>();
for(int i=0;i<nums.length;i++){
if(map.containsKey(nums[i])){
return true;
}
map.put(nums[i],1);
}
return false;
}
}
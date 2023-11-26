public int[] twoSum(int[] nums, int target) {
HashMap <Integer,Integer> map = new HashMap<>();
for(int i=0;i<nums.length;i++){
if(map.containsKey(target-nums[i])){
return new int[]{map.get(target-nums[i]),i};
}
map.put(nums[i],i);
}
return new int[]{};
}
}
​
// Using HashMap simple 4ms beats 64%
import java.util.*;
class Solution {
public int[] twoSum(int[] nums, int target) {
HashMap <Integer,Integer> map = new HashMap<>();
for(int i=0;i<nums.length;i++){
map.put(nums[i],i);
}
for(int i=0;i<nums.length;i++){
if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
return new int[]{i,map.get(target-nums[i])};
}
}
return new int[]{};
}
}
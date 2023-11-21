// Day104_Q2.java
class Solution {
    public boolean isPalindrome(String s) {
    s=s.toLowerCase();
    int left=0;
    int right =s.length()-1;
    while(left<right){
        if(!((s.charAt(left)>='a'&&s.charAt(left)<='z')||(s.charAt(left)>='0'&&s.charAt(left)<='9'))){
              left++;
          }
        else if(!((s.charAt(right)>='a'&&s.charAt(right)<='z')||(s.charAt(right)>='0'&&s.charAt(right)<='9'))){
              right--;
          }
        else{
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
    }
        return true;
    }
}
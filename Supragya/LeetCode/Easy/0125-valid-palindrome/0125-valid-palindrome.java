// Day104_Q2.java
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                str+=s.charAt(i);
            }
            else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                str+=Character.toLowerCase(s.charAt(i));
            }
        }
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
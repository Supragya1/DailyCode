class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int rev=0;
        while(n!=0){
           int ld = n%10;
            n/=10;
            rev = rev*10+ld;
        }
        if(x==rev){
            return true;
        }
        return false;
    }
}
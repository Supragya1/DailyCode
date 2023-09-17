// Day53_Q1.java
// reverseanumber_39.java
public class reverseanumber_39 {
    public static void main(String[]args){
        int n = 253565,reverse=0;
        while(n>0)
        {
           int lastdigit= n%10;
           reverse = reverse*10+lastdigit; // to  save the reversed number
           //System.out.print(lastdigit); to print the reversed umber
            n/=10;
        }
        System.out.println(reverse);
    }
}

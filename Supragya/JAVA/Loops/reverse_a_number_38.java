// Day52_Q2.java
// reverse_a_number_38.java
public class reverse_a_number_38 {
    public static void main(String[]args){
        int number = 25163;
        int a = number%10;
        number/=10;
        int b = number%10;
        number/=10;
        int c = number%10;
        number/=10;
        int d = number%10;
        number/=10;
        int e = number%10;
        System.out.println(a*10000+b*1000+c*100+d*10+e);
    }
}

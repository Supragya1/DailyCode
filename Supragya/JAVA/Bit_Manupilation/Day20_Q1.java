// FastExponentiation_124
import java.util.Scanner;

public class FastExponentiation_124 {
    public static int FastExponentiation(int a,int pow) {
        int ans=1;
        while(pow>0){
            if((pow&1)!=0){ // lsb is 1
                ans =ans *a;
            }
            a=a*a;
            pow=pow>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =2,pow=5;
        System.out.println(FastExponentiation(num,pow));
    }
}

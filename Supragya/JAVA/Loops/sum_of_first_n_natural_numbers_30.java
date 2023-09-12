// Day48_Q2.java
// sum_of_first_n_natural_numbers_30
import java.util.*;
public class sum_of_first_n_natural_numbers_30 {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the range n= ");
    int n = scan.nextInt();
    int count = 1;
    int sum = 0;
    while(count<=n){
    sum += count;
    count++;
    }  
    System.out.println(sum);
  }
}


// InbuiltSort_95
import java.util.*;

public class InbuiltSort_95 {
     public static void main(String []args){
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);  // INBUILT SORTING
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        Arrays.sort(a,1,6);  // INBUILT SORTING with starting and ending index and ending index sorts till (n-1)eg if 6  then will sort till 5
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        Integer b[] = {5,3,1,4,2};
        Arrays.sort(b,Collections.reverseOrder());  // INBUILT SORTING descending works on INTEGERS not int Integers are objects
        System.out.println("");
        for(int i=0;i<5;i++){
            System.out.print(b[i]+" ");
        }

    }
}

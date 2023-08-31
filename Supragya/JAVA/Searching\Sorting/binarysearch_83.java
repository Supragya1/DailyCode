
// binarysearch_83
// Time Complexity O(logN);
// Space Complexity O(1)
import java.util.*;
public class binarysearch_83{
    public static int binarysearch(int a[],int x){
        int start=0,end=a.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid] == x){
                return mid;
            }
            else if( a[mid]>x){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<a.length;i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a); // binary search always works on sorrted array
        System.out.println("Enter the number you want to search");
        int x = scan.nextInt();
        if(binarysearch(a, x)!=-1){
        System.out.println("Element found at index "+binarysearch(a, x));
        }
        else{
            System.out.println("Element Not found");
        }
    }
}

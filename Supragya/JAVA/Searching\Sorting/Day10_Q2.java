// Count sort
/*Counting sort is a sorting algorithm that sorts the elements of an array by counting
 the number of occurrences of each unique element in the array. The count is stored in
  an auxiliary array and the sorting is done by mapping the count as an index of the auxiliary array */
public class Countsort_95 {
    public static void main(String[]args){
        int a[]={1,6,5,4,1,2,3,5,1,2,3,5};
        int n=a.length;
        int max=a[0];
        for(int i=0;i<n;i++){
            max=Math.max(max, a[i]);
        }
        // frequency noting
        int b[]=new int[max+1];
        for(int i=0;i<n;i++){
            b[a[i]]++;
        }
        int j=0;
        //sorting
        for(int i=0;i<b.length;i++){
            while(b[i]>0){
                a[j]=i;
                j++;
                b[i]--;
            }
        }
         for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

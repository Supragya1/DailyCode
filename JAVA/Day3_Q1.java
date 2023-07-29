// Q Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
import java.io.*;
import java.util.*;
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        //Arrays.sort(a);
        int zero=0,one=0,two=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zero++;
            }
            else if(a[i]==1){
                one++;
            }
            else if(a[i]==2){
                two++;
            }
        }
        int i=0;
        while(zero!=0){
            a[i++]=0;
            zero--;
        }
        while(one!=0){
            a[i++]=1;
            one--;
        }
        while(two!=0){
            a[i++]=2;
            two--;
        }
    }
}
class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

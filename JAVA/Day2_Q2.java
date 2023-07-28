//Q2 Given an array A of N elements. Find the majority element in the array. A majority element in an array A of 
// size N is an element that appears more than N/2 times in the array.
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int freq=1;
        int j=0;
        Arrays.sort(a);
        for(int i=1;i<size-1;i++){
            if(a[i]==a[j]){
                freq++;
            }
            else{
                freq--;
            }
            if(freq==0){
                freq=1;
                j=i;
            }
        }
        freq = 0;
        for(int i=0; i<size; i++) {
            if(a[j] == a[i])
               freq++;
        }
        return (freq > size/2) ? a[j] : -1;
    }
}

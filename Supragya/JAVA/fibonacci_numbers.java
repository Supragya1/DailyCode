// Day2_Q1.java
// Q1 Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long arr[] = new long[n];
        arr[0]=1;
        long a=0,b=1,c=0;
        int count=1;
        while(count!=n){
            c=a+b;
            arr[count]=c;
            a=b;
            b=c;
            count++;
        }
        return arr;
    }
}

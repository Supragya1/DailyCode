// Day3_Q2.java
// Jump Game(GFG)
// Given an positive integer N and a list of N integers A[]. Each element in the array denotes the maximum length of jump you can cover. 
//Find out if you can make it to the last index if you start at the first index of the list.
import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.canReach(A,N));
        }
    }
}
class Solution {
    static int canReach(int[] a, int n) {
        // code here
        int reachable=0;
        for(int i=0;i<n;i++){
            if(reachable<i){
                return 0;
            }
            reachable=Math.max(reachable,a[i]+i);
        }
        return 1;
    }
    
};

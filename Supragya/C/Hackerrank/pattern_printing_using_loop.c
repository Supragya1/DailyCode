// Day78_Q2.c
// Pattern Printing using Loops Hackerrank
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main() 

{

    int n,k=1;

    scanf("%d", &n);
      for(int i=1;i<=2*n-1;i++){
          for (int j=1;j<=2*n-1;j++){
            for(int k=1;k<=n;k++){
                  if(j==k||i==k||j==2*n-k||i==2*n-k){
              printf("%d ",n-k+1);
              break;
              }
            }
          }
          printf("\n");
      }
    return 0;
}

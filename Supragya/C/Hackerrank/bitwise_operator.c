// Day78_Q1.c
// Bitwise Operator Hackerrank
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
void calculate_the_maximum(int n, int k) {
    int and,or,xor;
    int max=0;
  for(int i=1;i<n;i++){
      for(int j=i+1;j<=n;j++){
          and=i&j;
          if(max<and && and<k){
              max=and;
          }
      }
  }
  printf("%d\n",max);
  max=0;
  for(int i=1;i<n;i++){
      for(int j=i+1;j<=n;j++){
          or=i|j;
          if(max<or && or<k){
              max=or;
          }
      }
  }
  printf("%d\n",max);
  max=0;
  for(int i=1;i<n;i++){
      for(int j=i+1;j<=n;j++){
          xor=i^j;
          if(max<xor && xor<k){
              max=xor;
          }
      }
  }
  printf("%d\n",max);
}

int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
    return 0;
}

// Day4_Q2.c
// Sum of elements of array using reccursion
//Q1 Find sum of all array elements using recursion.
#include<stdio.h>
int sum_of_array(int array[],int n,int i){
    if(i>=n){
        return 0;
    }
   int sum1 = sum_of_array(array,n,i+1);
   int sum2 = sum1 + array[i] ;
  return sum2;
 }
int main(){
    int n,sum=0,i;
 printf("Enter the number of elements of the array\n");
 scanf("%d",&n);
 int array[n],x;
 for(i=0;i<n;i++){
    printf("Enter the %d element of array\n",i+1);
    scanf("%d",&x);
    array[i]=x;
 }
 i =0;
  sum =sum_of_array(array,n,i);
    printf("Sum =%d",sum);
}

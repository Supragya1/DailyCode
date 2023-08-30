// Day30_Q2.c
//Q13 Write a program to read an array of n numbers and then find the smallest number.
#include<stdio.h>
void scan(int a[],int n){
    for(int i=0;i<n;i++){
        printf("\na[%d] = ",i);
        scanf("%d",&a[i]);
    }
}
int smallest(int a[],int n){
    int min=a[0];
    for(int i=0;i<n;i++){
        if(min>a[i+1]){
            min=a[i+1];
        }
    }
    return min;
}
int main(){
    int n;
    printf("Enter the size of array\n");
    scanf("%d",&n);
   int a[n];
   scan(a,n);
int min =smallest(a,n);
printf("Smallest number is %d",min);
}

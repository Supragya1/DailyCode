//Q8 Write a program to insert a number in an array that is already sorted in ascending order.

#include<stdio.h>
int main(){
int a[100];
    int n,num;
    printf("Enter the size of array\n");
    scanf("%d",&n);
    printf("Enter the elements of the array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the number you wanna enter\n");
    scanf("%d",&num);

    for(int i=0;i<n;i++){
        if(a[i]<num){
            a[n]=num;
            break;
        }
        if(a[i]>num){
            for(int j = n-1;j>=i;j--){
                a[j+1]=a[j];
            }
            a[i]=num;
            break;
        }
            
    }
    n++;
    printf("Array after insertion\n");
    for(int i=0;i<n;i++){
    printf("%d ",a[i]);
   }
}

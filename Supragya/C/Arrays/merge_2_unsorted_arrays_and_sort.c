// Day42_Q2.c
//Q1 merging 2 arrays in third array and sort the third array
#include<stdio.h>
int main(){
    printf("Enter the size of array 1\n");
    int n1;
    scanf("%d",&n1);
    printf("Enter the size of array 2\n");
    int n2;
    scanf("%d",&n2);
    int arr1[n1],arr2[n2];
    printf("Enter the elements of array1\n");
    for(int i=0;i<n1;i++){
        scanf("%d",&arr1[i]);
    }
    printf("Enter the elements of array2\n");
    for(int i=0;i<n2;i++){
        scanf("%d",&arr2[i]);
    }
    int n3=n1+n2,arr3[n3];
    // merging 2 arrays in third array
    for(int i=0;i<n1;i++){
        arr3[i]=arr1[i];
    }
    for(int i=n1,j=0;i<n3,j<n2;i++,j++){
        arr3[i]=arr2[j];
    }
    // sorting the third array(bubble sort)
    for(int i=0;i<n3;i++){
        for(int j=i+1;j<n3;j++){
            if(arr3[i]>arr3[j]){
                int temp=arr3[i];
                arr3[i]=arr3[j];
                arr3[j]=temp;
            }
        }
    }
    printf("The merged array is\n");
    for(int i=0;i<n3;i++){
        printf("%d ",arr3[i]);
    }
}
// Day43_Q2.c
// merging 2 unsorted arrays in third array while sorting and merging at same time
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
    // merging 2 arrays in third array while sorting and merging at same time
    int k=0;
    for(int i1=0,i2=0;i1<n1,i2<n2;){
        int min1 =i1;
        int min2 =i2;
        for(int j1=i1+1;j1<n1;j1++){
            if(arr1[j1]<arr1[min1]){
                min1=j1;
            }
        }
        for(int j2=i2+1;j2<n2;j2++){
            if(arr2[j2]<arr2[min2]){
                min2=j2;
            }
        }
        if(arr1[min1]<arr2[min2]){
            arr3[k]=arr1[min1];
            k++;
            int temp=arr1[i1];
            arr1[i1]=arr1[min1];
            arr1[min1]=temp;
            i1++;}
        else{
            arr3[k]=arr2[min2];
            k++;
            int temp=arr2[i2];
            arr2[i2]=arr2[min2];
            arr2[min2]=temp;
            i2++;
        }
    }
    // print merged array
    printf("The merged array is\n");
    for(int i=0;i<n3;i++){
        printf("%d ",arr3[i]);
    }
}
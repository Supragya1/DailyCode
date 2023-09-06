// Day43_Q1.c
//Q1 merging 2 unsorted arrays in third array and sort the third array
// sort then merge
#include<stdio.h>
void bubblesort(int arr[],int n){
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
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
    // sort array1
    bubblesort(arr1,n1);
    // sort array2
    bubblesort(arr2,n2);
    // merge array1 and array2 in array3
    int i=0,j=0,k=0;
    while(i<n1 && j<n2){
        if(arr1[i]<arr2[j]){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        else{
            arr3[k]=arr2[j];
            j++;
            k++;
        }
    }
    while(i<n1){
        arr3[k]=arr1[i];
        i++;
        k++;
    }
    while(j<n2){
        arr3[k]=arr2[j];
        j++;
        k++;
    }
    // print merged array
    printf("The merged array is\n");
    for(int i=0;i<n3;i++){
        printf("%d ",arr3[i]);
    }
}
// Day46_Q2.c
// Write a program to implement binary search using recursion.
int binarysearch(int arr[],int start,int end,int target){
    if(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return mid;
    }
        else if(arr[mid]>target){
            return binarysearch(arr,start,mid-1,target);
        }
        else{
            return binarysearch(arr,mid+1,end,target);
        }
    }
    else{
        return -1;
    }   
}
#include<stdio.h>
int main(){
    printf("Enter the size of array\n");
    int n;
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements of array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to be searched\n");
    int target;
    scanf("%d",&target);
    int start=0,end=n-1;
    int ans= binarysearch(arr,start,end,target);
    if(ans==-1){
        printf("Element not found\n");
    }
    else{
        printf("Element found at index %d\n",ans);
    }
}
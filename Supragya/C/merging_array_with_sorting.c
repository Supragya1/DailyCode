// Day6_Q1.c
// Merging 2 arrays with sorting
#include<stdio.h>
#include <stdlib.h>
void scan(int n,int array[]){
    for(int i=0;i<n;i++){
     scanf("%d",&array[i]);
    }
}
void print(int n, int array[]){
    for(int i=0;i<n;i++){
     printf("%d ",array[i]);
    }
}

void merge_with_sorting(int n,int m,int array1[],int array2[]){
    int mergearray[n+m];
    int i,j,k;
    i=j=k=0;
    while(i<n && j<m){
        if(array1[i]>=array2[j]){
            mergearray[k]=array2[j];
            j++;
        }
        else{
            mergearray[k]=array1[i];
            i++;
        }
        k++;
    }
    while(i<n){
        mergearray[k]=array1[i];
        i++,k++;
    }
    while(j<m){
        mergearray[k]=array2[j];
        j++,k++;
    }
    printf("\nMerged and sorted array is\n");
    print(n+m,mergearray);
}
int main(){
    int n,m;
    printf("Enter the number of elements you want to enter in array1 and array2\n");
    scanf("%d%d",&n,&m);
    int array1[n],array2[m];

    printf("Enter the elements of first array\n");
    scan(n,array1);
 printf("first array\n");
 print(n,array1);

printf("\nEnter the elements of second array\n");
   scan(m,array2);

     printf("second array\n");
 print(m,array2);

merge_with_sorting(n,m,array1,array2);
}

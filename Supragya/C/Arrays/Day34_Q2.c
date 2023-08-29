//Q4 merging 2 arrays in first array(dynamic memory allocation)

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

void merge(int n,int m,int array1[],int array2[]){
int *ptr1;

ptr1= (int *)realloc(array1,sizeof(int)*m);
for(int i=0;i<m;i++){
    array1[n+i]=array2[i];
}
printf("\nMerged array is\n");
print(n+m,array1);
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

merge(n,m,array1,array2);
}

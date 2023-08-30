// Day34_Q1.c
//Q3 merging 2 arrays in first array
#include<stdio.h>
#include<stdlib.h>
void scan(int a[],int n){
for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
}

}
int main(){
    int a[10],b[10],n,m;
    printf("Enter the size of array1\n");
    scanf("%d",&n);
    printf("Enter the size of array2\n");
    scanf("%d",&m);
    printf("Enter the elements of array1\n");
    scan(a,n);
     printf("Enter the elements of array2\n");
    scan(b,m);
    int *ptr = (int*)realloc(a,sizeof(int)*m);
    for(int i=0;i<m;i++){
        a[n+i]=b[i];
    }
        printf("The merged array is\n");
    for(int i=0;i<n+m;i++){
        printf("%d ",a[i]);
    }
}

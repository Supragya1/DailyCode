// Day33_Q2.c
//Q2 merging 2 arrays in third array (no extra memory)
#include<stdio.h>
#include<stdlib.h>
void scan(int a[],int n){
for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
}

}
int main(){
    int n,m;
    printf("Enter the size of array1\n");
    scanf("%d",&n);
    printf("Enter the size of array2\n");
    scanf("%d",&m);
   int a[n],b[m],c[n+m];
    printf("Enter the elements of array1\n");
    scan(a,n);
     printf("Enter the elements of array2\n");
    scan(b,m);
        for(int i=0;i<n;i++){
        c[i]=a[i];
    }
    for(int i=n,j=0;i<n+m,j<m;i++,j++){
        c[i]=b[j];
    }
    printf("The merged array is\n");
    for(int i=0;i<n+m;i++){
        printf("%d ",c[i]);
    }
}

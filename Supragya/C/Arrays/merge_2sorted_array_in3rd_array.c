// Day35_Q1.c
//Q5 merging 2 sorted arrays in third array
#include<stdio.h>
void scan(int a[],int n){
for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
}
}
int main(){
    int n,m;
    printf("Enter the size of array 1\n");
    scanf("%d",&n);
    printf("Enter the size of array 2\n");
    scanf("%d",&m);
    int a[n],b[m],c[n+m];
    printf("Enter the elements of array 1\n");
   scan(a,n);
   printf("Enter the elements of array 2\n");
   scan(b,m);
int index=0,index1=0,index2=0;
   while(index1<n && index2<m){
    if(a[index1]<b[index2]){
        c[index]=a[index1];
        index++,index1++;
    }
    else{
        c[index]=b[index2];
        index++,index2++;
    }
if(index1==m){
    while(n>index1){
        c[index]=a[index1];
        index++,index1++;
    }
}
if(index2==n){
    while(m>index2){
        c[index]=b[index2];
        index++,index2++;
    }
}
     
   }

   printf("The merged array is\n");
    for(int i=0;i<n+m;i++){
         printf("%d ",c[i]);
     }
}

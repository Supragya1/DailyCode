// Q Write a program to delete a number from an array that is already sorted in ascending order.
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
printf("Enter the Element you want to Delete\n");
scanf("%d",&num);

for(int i=0;i<n;i++){
    if(a[i]==num){
        for(int j=i;j<=n-1;j++){
        a[j]=a[j+1];
        }
          n--;
       break;
    }
  
}
printf("array after deletion\n");
for(int i=0;i<n;i++){
        printf("%d ",a[i]);
     }
}


// Q16 Write a program to print the elements of a 2D array.

#include<stdio.h>
int main(){
    int n,m;
    printf("Enter the number of rows\n");
    scanf("%d",&n);
    printf("Enter the number of columns\n");
    scanf("%d",&m);
    printf("Enter the elements in the array\n");
    int a[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           printf("a[%d][%d] = ",i,j);
           scanf("%d",&a[i][j]);
        }
    }

    printf("The array is \n");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}

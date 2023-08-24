//Q 24 Write a program to fill a square matrix with value zero on the diagonals, 1 on the upper
// right triangle, and –1 on the lower left triangle.

#include<stdio.h> 
int main(){
    int n=3;
    int a[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
                a[i][j]=0;
            }
            else if(j>i){
                a[i][j]=1;
            }
            else
            a[i][j]=-1;
        }
    }

 printf("The matrix is \n");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }


}

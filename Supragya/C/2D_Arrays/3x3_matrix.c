// Day26_Q2.c
//Q20 Write a program to read and display a 3 X 3 matrix.

#include<stdio.h>
int main(){
    int a[3][3];
    printf("Enter the elements of the array \n");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            printf("a[%d][%d] = ",i,j);
            scanf("%d",&a[i][j]);
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

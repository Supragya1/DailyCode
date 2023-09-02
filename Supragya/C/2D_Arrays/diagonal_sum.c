// Day38_Q1.c
/*Q7 Write a program that computes the sum of the
elements that are stored on the main diagonal of
a matrix using pointers.*/

#include<stdio.h>
int main(){int sum=0;
    int a[3][3]={1,2,3,4,5,6,7,8,9};
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        if(i==j){
            sum+=a[i][j];
        }
        }
    }
    printf("Sum of diagonals is %d",sum);
}

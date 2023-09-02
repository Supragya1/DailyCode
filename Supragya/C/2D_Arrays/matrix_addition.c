// Day38_Q2.c
/*Write a program to add two 3 x 3 matrix using
pointers.*/

#include<stdio.h>
void matrix_add(int *a,int *b,int *c){
for(int i=0;i<9;i++){
    *(c+i)=*(a+i)+*(b+i);
}
}
int main(){
    
    int a[3][3],b[3][3],c[3][3];
 
 printf("Enter elements of matrix 1 (3x3):\n");
    for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++) {
            scanf("%d", (*(a + i) + j));
        }
    }
    printf("Enter elements of matrix 1 (3x3):\n");
    for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++) {
            scanf("%d", (*(b + i) + j));
        }
    }
matrix_add(&a[0][0],&b[0][0],&c[0][0]);
 printf("elements of resultant matrix  (3x3):\n");
    for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++) {
            printf("%d ", c[i][j]);

        }
        printf("\n");
}
}

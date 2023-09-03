// Day5_Q1.c
//Q4 Find the sum of rows and columns of matrix of a given order (row x column).
#include<stdio.h>
int main(){
    int rows,columns;
    printf("Enter the number of rows\n");
    scanf("%d",&rows);
    printf("Enter the number of columns\n");
    scanf("%d",&columns);
    int array[rows][columns];
    printf("Enter the elements of array matrix \n");
     for(int i=0;i<rows;i++){
        for(int j=0;j<rows;j++){
         printf("Enter %dth row and %dth column \n",i,j);
         scanf("%d",&array[i][j]);
        }
     }
    
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
        
         printf("%d ",array[i][j]);
        }
        printf("\n");
     }

     int rowsum=0,colsum=0;
     printf("\nsum of rows\n");
     for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            rowsum+=array[i][j];
        }
        printf("Sum of row %d is %d \n",i,rowsum);
        rowsum =0;
     }
  printf("\nsum of columns\n");
for(int j=0;j<columns;j++){
        for(int i=0;i<rows;i++){
            colsum+=array[i][j];
        }
        printf("Sum of column %d is %d \n",j,colsum);
        colsum=0;
     }
}

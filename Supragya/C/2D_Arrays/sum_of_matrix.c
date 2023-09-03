// Day28_Q1.c
// Q22 Write a program to input two m X n matrices and then calculate the sum of their
//corresponding elements and store it in a third m X n matrix.

#include<stdio.h>

void print(int m,int n,int a[m][n]){
 printf("The sum of matrixes is \n");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}

void scan(int m,int n,int a[][n],int x){
           printf("Enter the elements of the array %d\n",x);
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            printf("a[%d][%d] = ",i,j);
            scanf("%d",&a[i][j]);
        }
    }
}

void sum(int m,int n,int a[][n],int b[][n]){
int c[m][n];
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        c[i][j] = a[i][j]+b[i][j];
    }
}
print(m,n,c);
}

int main(){
int m,n;
printf("Enter the number of rows\n");
scanf("%d",&m);
printf("Enter the number of columns\n");
scanf("%d",&n);

int a[m][n],b[m][n];
scan(m,n,a,1);
scan(m,n,b,2);
sum(m,n,a,b);
}

// Day28_Q2.c
//Q23 Write a program to multiply two m X n matrices.

#include<stdio.h>

void print(int m,int n,int a[m][n]){
 printf("The product of matrixes is \n");
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

void multiply(int m,int n,int p, int q,int a[m][n],int b[p][q]){
int c[m][q];
for(int i=0;i<m;i++){
    for(int j=0;j<q;j++){
        c[i][j]=0;
        for(int k=0;k<n;k++){
           
            c[i][j]+=a[i][k]*b[k][j];
        }

    }
}

print(m,q,c);
}

int main(){
    int m,n,p,q;
printf("Enter the number of rows array1\n");
scanf("%d",&m);
printf("Enter the number of columns of array1\n");
scanf("%d",&n);

printf("Enter the number of rows array2\n");
scanf("%d",&p);
printf("Enter the number of columns of array2\n");
scanf("%d",&q);

int a[m][n],b[m][n];
scan(m,n,a,1);
scan(p,q,b,2);
if(n==p){
multiply(m,n,p,q,a,b);
}
else{
    printf("Multiplication can't occur \n");
}
}

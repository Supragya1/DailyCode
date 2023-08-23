//Q21 Write a program to transpose a 3 X 3 matrix.

#include<stdio.h>
void print(int a[3][3]){
 printf("The matrix is \n");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}

void transpose(int a[3][3]){
     int b[3][3];

     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            b[i][j]=a[j][i];
        }
     }
 print(b);

}


int main(){
    int a[3][3];
   
       printf("Enter the elements of the array \n");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            printf("a[%d][%d] = ",i,j);
            scanf("%d",&a[i][j]);
        }
    }

    print(a);
  transpose(a);

}

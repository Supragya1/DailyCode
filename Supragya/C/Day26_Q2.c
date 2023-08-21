// Q19 Write a program to read a 2D array marks which stores the marks of five students in four
//subjects. Write a program to display the highest marks in each subject.

#include<stdio.h>
int main(){
int a[5][4];

for(int i=0;i<5;i++){
     printf("Enter the marks of student %d in 4 subjects \n",i+1);
    for(int j=0;j<4;j++){
   scanf("%d",&a[i][j]);
    }
}

int max =a[0][0];
for(int i=0;i<4;i++){
    for(int j=0;j<5;j++){
        if(max<a[j][i]){
            max = a[j][i];
        }
    }
    printf("Highest marks in subject %d is %d \n",i+1,max);
        max =a[0][0];
}
}

Q20 Write a program to read and display a 3 X 3 matrix.

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

// Day37_Q2.c
/*Q1 Consider an array MARKS[20][5] which stores the
marks obtained by 20 students in 5 subjects. Now
write a program to
(a) find the average marks obtained in each
subject.
(b) find the average marks obtained by every
student.
(c) find the number of students who have scored
below 50 in their average.
(d) display the scores obtained by every student.*/

// MARKS ARE OUT OF 100

#include<stdio.h>
void avg_marks_subject(int a[20][5]){
    int sum=0;
for(int i=0;i<5;i++){
    for(int j=0;j<20;j++){
        sum+=a[j][i];
    }
    printf("Avg marks in subject %d is %f \n",i+1,(float)sum/20);
    sum=0;
}
}

int avg_marks_student(int a[20][5]){
    int sum=0,count=0;
    for(int i=0;i<20;i++){
        for(int j=0;j<5;j++){
            sum+=a[i][j];
        }
        printf("Avg marks obtained by student %d is %d \n",i+1,sum/5);
        if(sum/500<50){
            count++;
        }
        sum=0;
    }
return count;
}

void display(int a[20][5]){
    for(int i=0;i<20;i++){
        for(int j=0;j<5;j++){
            printf("Marks scored by student %d in subject %d is %d\n",i+1,j+1,a[i][j]);
        }
    }
}
int main(){
    int a[20][5];
int count;
    for(int i=0;i<20;i++){
        printf("Enter marks of student %d in 5 subjects\n",i+1);
        for(int j=0;j<5;j++){
      scanf("%d",&a[i][j]);
        }
    }

avg_marks_subject(a);
count = avg_marks_student(a);
printf("Number of students who have scored below 50 in their average are %d\n",count);
display(a);

}

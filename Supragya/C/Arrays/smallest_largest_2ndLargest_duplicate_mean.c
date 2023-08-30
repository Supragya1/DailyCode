// Day35_Q2.c
//Q1 Write a program to read and display n numbers using an array.
//Q2 Write a program to find the mean of n numbers using arrays.
//Q3 Write a program to print the position of the smallest number of n numbers using arrays.
//Q4 Write a program to find the second largest of n numbers using an array.
//Q5 Write a program to enter n number of digits. Form a number using these digits
//Q6 Write a program to find whether the array of integers contains a duplicate number.
#include<stdio.h>
#include<math.h>
#include<limits.h>
void scan(int a[],int  n){
    printf("Enter the elements of the array\n");
    for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
    }
}
void display(int a[],int n){
    printf("The elements of array are :\n");
for(int i=0;i<n;i++){
    printf("%d ",a[i]);
    }
}

void mean(int a[],int n){
    int sum=0;
    for(int i=0;i<n;i++){
    sum+=a[i];
    }
    float mean = (float)sum/n;
   printf("\nSum = %d\n",sum);
   printf("Mean = %.2f\n",mean);
}

void smallest(int a[],int n){
    int smallest=a[0];
    int pos=0;
    for(int i=0;i<n-1;i++){
        if(smallest>a[i+1]){
            smallest =a[i+1];
            pos=i+1;
        }
    }

    printf("Smallest element in array is %d\n",smallest);
    printf("Position of the smallest element is %d\n",pos);
}

void second_largest(int a[],int n){
    int largest =INT_MIN;
    int second_largest=INT_MIN;
    for(int i=0;i<n;i++){
        if(largest<a[i]){
            second_largest = largest;
            largest =a[i];
        }
        else if(second_largest<a[i]&&largest!=a[i]){
    second_largest = a[(i)];
}
}
if(second_largest==INT_MIN){
    printf("There is no second largest element in the array\n");
}
else{
    
 printf("largest element in array is %d\n",largest);
    printf("second_largest element is %d\n",second_largest);
}
}

void create_number(int a[],int n){
    long digit=0;
   for(int i=n-1;i>=0;i--){
    digit=digit*10+a[i];
   }
    printf("The number formed is %li\n",digit);
}

void duplicate(int a[],int n){
    int flag=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        if(a[i]==a[j]){
            flag=1;
            printf("Duplicate numbers found at position %d and %d \n",i,j);
            break;
        }
        }
    }if(flag!=1){
printf("NO Duplicate Number Found");
    }
    
}
int main(){
    int n;
    printf("Enter the size of the array\n");
    scanf("%d",&n);
    int a[n];
     
   scan(a,n);
   display(a,n);
   mean(a,n);
   smallest(a,n);
   second_largest(a,n);
   create_number(a,n);
   duplicate(a,n);

}

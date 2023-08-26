// Q14 Write a program to interchange the largest and the smallest number in an array.4
#include<stdio.h>
void scan(int a[],int n){
    for(int i=0;i<n;i++){
        printf("\na[%d] = ",i);
        scanf("%d",&a[i]);
    }
}

int smallest(int a[],int n){
    int min=a[0];
    for(int i=0;i<n-1;i++){
        if(min>a[i+1]){
            min=a[i+1];
        }
    }
    return min;
}

int largest(int a[],int n){
    int max=a[0];
    for(int i=0;i<n-1;i++){
        if(max<a[i+1]){
            max=a[i+1];
        }
    }
    return max;
}

void display(int a[],int n){
    printf("\nUpdated array is\n");
    for(int i=0;i<n;i++){
        if(a[i]==smallest(a,n)){
        printf("%d ",largest(a,n));
        }
       else if(a[i]==largest(a,n)){
        printf("%d ",smallest(a,n));
        }
        else
        printf("%d ",a[i]);
    }
}
int main(){
    int n;
    printf("Enter the size of array\n");
    scanf("%d",&n);
    int a[n];
    scan(a,n);
    display(a,n);
}

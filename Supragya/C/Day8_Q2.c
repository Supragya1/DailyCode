// Second largest number in a array without sorting
#include<stdio.h>
#include<limits.h>
int main(){
    int n;
    printf("Enter the number of elements you want to insert in the array\n");
    scanf("%d",&n);
    int array[n];
    printf("Enter the elements in the array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&array[i]);
    }

    for(int i=0;i<n;i++){
        printf("%d ",array[i]);
    }
int x=INT_MIN,y=INT_MIN;
for(int i=0;i<n;i++){
if(x<array[i]){
    y=x;
    x = array[(i)];
}
else if(y<array[i]&&x!=array[i]){
    y = array[(i)];
}
}
if(y==INT_MIN){
    printf("There is no second largest element in the array\n");
}
else{
printf("\nLargest number =%d \n",x);
printf("Second largest number =%d \n",y);
}
}

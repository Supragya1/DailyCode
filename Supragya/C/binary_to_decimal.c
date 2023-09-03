// Day39_Q1.c
// binary to decimal
#include<stdio.h>
#include<math.h>
int binary(int a){
int ld,dec=0;
int i=0;
while(a>0){
    ld=a%10;
    a/=10;
 dec+=ld*pow(2,i);
 i++;
}
return dec;
}
int main(){
int a;
printf("Enter the decimal number");
scanf("%d",&a);
printf("%d",binary(a));
}

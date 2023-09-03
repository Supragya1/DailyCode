// Day25_Q1.c
/*Write a program to take input from the user and
then check whether it is a number or a character.
If it is a character, determine whether it is in upper
case or lower case. Also print its ASCII value*/

#include<stdio.h>
int main(){char a;
    printf("Enter a character or a number\n");
    scanf("%c",&a);
    if((a>=65&&a<=90)||(a>=97&&a<=122)){
    printf("It is a character\n");}
    else
    printf("It is a number\n");

     if(a>=65&&a<=90)
     printf("It is Upper case \n");

     if((a>=97&&a<=122))
     printf("It is Lower case \n");

     printf("ASCII Value is %d ",a);
}

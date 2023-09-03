// Day24_Q2.c
/*Write a program to read a character and print it.
Also print its ASCII value. If the character is in
lower case, print it in upper case and vice versa.
Repeat the process until a ‘*’ is entered.*/
#include <stdio.h>

int main()
{  char a;
   while(1){
  
   printf("Enter a character\n");
   scanf(" %c",&a);
   if(a=='*'){
      break;
   }
   printf("The Entered character is :%c\n",a);
   printf("Its ASCII value is : %d\n",a);


   if(a>=97&&a<=122){
      a=a-32;
      printf("The Upper case is : %c\n",a);
   }
   else if(a>=65&&a<=90){
      a=a+32;
      printf("The Lower case is : %c\n",a);
   }
   
 }
}

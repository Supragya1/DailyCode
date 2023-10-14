// Day77_Q1.c
// For Loop in C Hackerrank
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int check(int a,int b){
    for(int i=a;i<=b;i++,a++){
    switch(a){
    
         case 1 :
         printf("one\n");
         break;
         case 2 :
         printf("two\n");
         break;
          case 3 :
         printf("three\n");
         break;
        case 4:
         printf("four\n");
         break;
        case 5 :
         printf("five\n");
         break;
         case 6 :
         printf("six\n");
         break;
         case 7:
         printf("seven\n");
         break;
         case 8 :
         printf("eight\n");
         break;
         case 9:
         printf("nine\n");
         break;
         return 1;
         
      }
    }
      if(a<=9&&a>=1)
      return 1;
      else 
         return 0;
  
}
void even(int a,int b){
    a=10;
    for(int i=10;i<=b;i++,a++){
        
    if(a%2==0)
{
    printf("even\n");
}
    else
    printf("odd\n");
}}

int main() 
{
    int a, b,x,y;
    scanf("%d\n%d", &a, &b);
      x=check(a,b);
     y= check(b,a);
   
    
     even(a,b);
    return 0;
}
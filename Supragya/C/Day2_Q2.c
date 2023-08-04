// advance max of 3
// to find maximum number between 3 numbers
#include<stdio.h>
int main(){
      int a,b,c;
    printf("enter three Numbers\n");
    scanf("%d%d%d",&a,&b,&c);
              if(a!=b && b!=c && c!=a)
              {
                if(a>b)
                 {
                  if(a>c)
                  printf("a = %d is the biggest number",a);
                  else 
                  printf("c = %d is the biggest number",c);
                 }
                 else
                 if(b>c)
                printf("b = %d is the biggest number",b);
                 else
                 printf("c = %d is the biggest number",c);
              }
              else 
              if(a!=b || b!=c || c!=a)
             {
              if(a==b && (b>c || b<c))
              {
                if(b>c)
                printf("a =%d and b = %d are equal and greater than c = %d",a,b,c);
                else
               printf("a =%d and b = %d are equal but c =%d is greater then both",a,b,c);
              }
              if (b==c && (c>a || c<a))
              {
                if(c>a)
                printf("c = %d and b = %d are equal and greater than a =%d ",c,b,a);
                else
                printf("c = %d and b =%d are equal but a = %d is greater then both",c,b,a);
              }
              if (a==c && (c>b || c<b))
              {
                if(c>b)
                printf("a = %d and c = %d are equal and greater than b = %d",a,c,b);
                else
                printf("a =%d and c = %d are equal but b = %d is greater then both",a,c,b);
              }
            }
              else 
            printf("All numbers are same");
    }


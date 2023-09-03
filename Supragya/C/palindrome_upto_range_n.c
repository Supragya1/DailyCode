// Day3_Q2.c
// palindrome range upto n
#include<stdio.h>
int main(){ int range;
    printf("Enter range\n");
    scanf("%d",&range);
        int reverse=0,ld,num,i,count=0;
      
          for(i=0;i<=range;i++){
             num = i;
                while(num>0){
                    ld = num%10;
                    reverse = reverse*10+ld;
                    num/=10;
                }
               
               if(i==reverse)
              {  printf("%d ",reverse);
             count+=1;
             }
              reverse =0;
              
             
          }
            printf("\n%d", count);
}

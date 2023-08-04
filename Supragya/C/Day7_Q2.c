// Hollow Diamond
#include<stdio.h>
int main(){
    int rows;
    printf("Enter number of rows\n");
    scanf("%d",&rows);
    for(int i=0;i<rows;i++){\
      for(int j=0;j<rows-i+1;j++){
      printf(" ");
      }
      
      for(int j=0;j<(2*i)+1;j++){
          if(j==0||(j==(i*2))){
              printf("*");
          }
          else
      printf(" ");
      }
      printf("\n");
    }
     for(int i=rows;i>=0;i--){\
      for(int j=0;j<rows-i+1;j++){
      printf(" ");
      }
      
      for(int j=0;j<(2*i)+1;j++){
          if(j==0||(j==(i*2))){
              printf("*");
          }
          else
      printf(" ");
      }
      printf("\n");
    }
    
   
}

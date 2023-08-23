// Q18 In a small company there are five salesmen. Each salesman is supposed to sell three
// products. Write a program using a 2D array to print (i) the total sales by each salesman
// and (ii) total sales of each item.

#include<stdio.h>
int main(){
    int a[5][3],sum=0;
    for(int i=0;i<5;i++){
        printf("Enter the sales of 3 items by salesman %d\n",i+1);
        for(int j=0;j<3;j++){
            
            scanf("%d",&a[i][j]);

        }
    }
    
    for(int i=0;i<5;i++){
        printf("Total sales made by salesman %d is ",i+1);
        for(int j=0;j<3;j++){ 
            sum += a[i][j];
        }
        printf("%d\n",sum);
        sum=0;
        
    }

    for(int i=0;i<3;i++){
            printf("Total sales of item %d ",i+1);
            for(int j=0;j<5;j++){
            sum+=a[j][i];
            }
            printf("%d\n",sum);
        sum=0;
        }
    }

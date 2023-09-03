// Day40_Q2.c
// armstrong_upto_range_n
#include<stdio.h>
#include<math.h>
int isarmstrong(int n){
    int x=n,ld,poe=0,sum=0;
    while(x>0){
        x/=10;
        poe++;
    }
    x=n;
    while(x>0){
        ld=x%10;
        sum+=pow(ld,poe);
        x/=10;
    }
    if(sum==n){
        return 1;
    }
    else{
        return 0;
    }
}
int main(){
    printf("Enter the range upto which you want to print armstrong numbers\n");
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        if(isarmstrong(i)){
            printf("%d ",i);
        }
    }

}

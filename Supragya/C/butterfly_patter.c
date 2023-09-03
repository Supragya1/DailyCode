// Day40_Q1.c
// Butterfly pattern
#include<stdio.h>
void butter(int lines){
    for(int i = 1;i<=lines;i++){
        for(int j = 1;j<=i;j++){
            printf("*");
        }
        for(int j=1;j<=2*(lines-i);j++){
            printf(" ");
        }
        for(int j = 1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
     for(int i = lines;i>=1;i--){
        for(int j = 1;j<=i;j++){
            printf("*");
        }
        for(int j=1;j<=2*(lines-i);j++){
            printf(" ");
        }
        for(int j = 1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
}
int main(){
    int lines;
    printf("ENTER LINES: ");
    scanf("%d",&lines );
butter(lines);
}

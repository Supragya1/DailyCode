// Day80_Q2.c
// Digit Frequency Hackerrank
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char str[1000];
    scanf("%s",&str);
    int arr[10];
    for(int i=0;i<10;i++){
        arr[i]=0;
    }
    
    for(int i=0;str[i]!='\0';i++){
        if(str[i]>='0'&& str[i]<='9'){
            arr[((int)str[i]-'0')]++;
        }
    }
    for(int i=0;i<10;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}

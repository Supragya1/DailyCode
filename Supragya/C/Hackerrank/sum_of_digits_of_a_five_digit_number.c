// Day77_Q2.c
// Sum of Digits of a Five Digit Number Hackerrank
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    int ld=0,sum=0;
    while(n!=0){
        ld=n%10;
        sum+=ld;
        n/=10;
    }
    printf("%d",sum);
    return 0;
}
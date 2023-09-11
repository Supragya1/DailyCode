// Day47_Q2.c
// Find the number of times digit x(0-9) occurs in each and every number from 0 to n
#include <stdio.h>
int main(){
    int n, x;
    printf("Enter the value of n (range): ");
    scanf("%d", &n);
    printf("Enter the value of x (digit from 0-9): ");
    scanf("%d", &x);
    int count = 0;
    for (int i = 0; i <= n; i++){
        int temp = i;
        while (temp != 0){
            if (temp % 10 == x){
                count++;
            }
            temp /= 10;
        }
    }
    printf("The number of times %d occurs in each and every number from 0 to %d is %d\n", x, n, count);
    return 0;
}
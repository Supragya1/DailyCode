// Day39_Q2.c
// Armstrongnumber.c
#include <stdio.h>
#include <math.h>

int main() {
    printf("Enter the number\n");
    int num;
    scanf("%d", &num);
    int n = num, x = num, ld, poe = 0, sum = 0;
    double power;
    
    while (n > 0) {
        n /= 10;
        poe++;
    }

    while (x > 0) {
        ld = x % 10;
        power = pow(ld, poe);
        sum += (int)power;  
        x /= 10;
    }

    if (sum == num) {
        printf("%d is an Armstrong number.\n", num);
    } else {
        printf("%d is not an Armstrong number.\n", num);
    }

    return 0;
}

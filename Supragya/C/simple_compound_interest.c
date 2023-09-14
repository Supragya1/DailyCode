//Day50_Q2.c
// write a program to calculate simple and compound interest
#include <stdio.h>
#include <math.h>

float calculateSimpleInterest(float principal, float rate, int time) {
    return (principal * rate * time) / 100.0;
}

float calculateCompoundInterest(float principal, float rate, int time) {
    return principal * (pow(1 + rate / 100.0, time) - 1);
}

int main() {
    float principal, rate;
    int time;
    printf("Enter principal amount: ");
    scanf("%f", &principal);
    
    printf("Enter rate of interest: ");
    scanf("%f", &rate);
    
    printf("Enter time period (in years): ");
    scanf("%d", &time);
    
    float simpleInterest = calculateSimpleInterest(principal, rate, time);
    float compoundInterest = calculateCompoundInterest(principal, rate, time);
    printf("Simple Interest: %.2f\n", simpleInterest);
    printf("Compound Interest: %.2f\n", compoundInterest);
    
    return 0;
}

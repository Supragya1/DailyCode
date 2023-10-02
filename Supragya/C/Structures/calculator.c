// Day68_Q1.c
// Write a c program a simple calculator. Include functions for addition, subtraction, multiplication, and division.
#include <stdio.h>
struct Calculator {
    float a;
    float b;
};
float add(struct Calculator c) {
    return calculator.a + calculator.b;
}
float sub(struct Calculator c) {
    return calculator.a - calculator.b;
}
float mul(struct Calculator c) {
    return calculator.a * calculator.b;
}
float div(struct Calculator c) {
    if(calculator.b == 0) {
        printf("Division by zero is not possible\n");
        return 0;
    }
    else{
    return calculator.a / calculator.b;
    }
}
int main() {
    struct Calculator calculator;
    printf("Enter the first number\n");
    scanf("%f", &calculator.a);
    printf("Enter the second number\n");
    scanf("%f", &calculator.b);
    printf("The sum of the two numbers is %f\n", add(calculator));
    printf("The difference of the two numbers is %f\n", sub(calculator));
    printf("The product of the two numbers is %f\n", mul(calculator));
    printf("The division of the two numbers is %f\n", div(calculator));
    return 0;
}



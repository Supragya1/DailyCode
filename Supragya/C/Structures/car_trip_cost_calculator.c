// Day68_Q2.c
// Write a C program that uses a structure to represent a car. Include members for the model, color, 
// and fuel efficiency. Calculate and display the cost of a trip given the distance and fuel price.
#include <stdio.h>
struct Car {
    char model[20];
    char color[20];
    float fuel_efficiency;
};
float cost(struct Car car, float distance, float fuel_price) {
    return (distance / car.fuel_efficiency) * fuel_price;
}
int main() {
    struct Car car;
    printf("Enter the model of the car\n");
    scanf("%s", car.model);
    printf("Enter the color of the car\n");
    scanf("%s", car.color);
    printf("Enter the fuel efficiency of the car\n");
    scanf("%f", &car.fuel_efficiency);
    float distance, fuel_price;
    printf("Enter the distance of the trip\n");
    scanf("%f", &distance);
    printf("Enter the fuel price\n");
    scanf("%f", &fuel_price);
    printf("The cost of the trip is %f\n", cost(car, distance, fuel_price));
    return 0;
}

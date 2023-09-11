// Day47_Q1.c
// Write a C program to accept a coordinate point in an XY coordinate system and 
// determine in which quadrant the coordinate point lies
#include <stdio.h>

int main() {
    float x, y;
    printf("Enter the x-coordinate: ");
    scanf("%f", &x);
    printf("Enter the y-coordinate: ");
    scanf("%f", &y);
    int quadrant;
    if (x > 0 && y > 0) {
        quadrant = 1;
    } else if (x < 0 && y > 0){
        quadrant = 2;
    } else if (x < 0 && y < 0){
        quadrant = 3;
    } else if (x > 0 && y < 0){
        quadrant = 4;
    } else if (x == 0 && y == 0){
        quadrant = 0;
    } else if (x == 0 || y == 0){
        quadrant = -1; 
    }
    switch (quadrant) {
        case 0:
            printf("The point (%.2f, %.2f) is at the origin\n", x, y);
            break;
        case 1:
            printf("The point (%.2f, %.2f) is in Quadrant I\n", x, y);
            break;
        case 2:
            printf("The point (%.2f, %.2f) is in Quadrant II\n", x, y);
            break;
        case 3:
            printf("The point (%.2f, %.2f) is in Quadrant III\n", x, y);
            break;
        case 4:
            printf("The point (%.2f, %.2f) is in Quadrant IV\n", x, y);
            break;
        case -1:
            printf("The point (%.2f, %.2f) lies on an axis\n", x, y);
            break;
        default:
            printf("Invalid input\n");
    }
    return 0;
}


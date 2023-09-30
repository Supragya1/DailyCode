// Day66_Q2.c
// Write a program to add two distances in inch-feet by creating a structure named distance.
#include <stdio.h>
struct distance
{
    int feet;
    int inch;
};
int main()
{
    struct distance d1, d2, sum;
    printf("Enter the distance 1 in feet and inch\n");
    scanf("%d%d", &d1.feet, &d1.inch);
    printf("Enter the distance 2 in feet and inch\n");
    scanf("%d%d", &d2.feet, &d2.inch);
    sum.feet = d1.feet + d2.feet;
    sum.inch = d1.inch + d2.inch;
    if (sum.inch >= 12)
    {
        sum.feet += sum.inch / 12;
        sum.inch = sum.inch % 12;
    }
    printf("The sum of distance 1 and distance 2 is %d feet and %d inch", sum.feet, sum.inch);
}
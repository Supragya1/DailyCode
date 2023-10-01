//Day67_Q2.c
// Write a C Program to enter Students Details using Structure array.
#include <stdio.h>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main()
{
    printf("Enter the number of students: ");
    int n;
    scanf("%d", &n);
    struct student s[n];
    printf("Enter information of students:\n");
    for (int i = 0; i < n; i++)
    {
        printf("Enter name: ");
        scanf("%s", s[i].name);
        printf("Enter roll number: ");
        scanf("%d", &s[i].roll);
        printf("Enter marks: ");
        scanf("%f", &s[i].marks);
    }
    printf("Displaying Information\n");
    for (int i = 0; i < n; i++)
    {
        printf("Name: ");
        printf("%s\n", s[i].name);
        printf("Roll number: %d\n", s[i].roll);
        printf("Marks: %.1f\n", s[i].marks);
    }
    return 0;
}
    
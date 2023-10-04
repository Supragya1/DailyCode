// Day70_Q1.c
// Write  a program to create a structure called book and store the title, author and price. 
// Read these values from the user and display them back, using functions.
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct book{
    char title[100];
    char author[100];
    float price;
};
int main(){
    struct book b;
    printf("Enter the title of the book: ");
    scanf("%[^\n]%*c",b.title);//%[^\n]%*c is used to take input with spaces
    printf("Enter the author of the book: ");
    scanf("%[^\n]%*c",b.author);
    printf("Enter the price of the book: ");
    scanf("%f",&b.price);
    printf("The title of the book is %s\n",b.title);
    printf("The author of the book is %s\n",b.author);
    printf("The price of the book is %f\n",b.price);
    return 0;
}
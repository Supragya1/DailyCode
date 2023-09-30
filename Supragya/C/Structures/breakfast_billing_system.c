// Day66_Q1.c
// Write a program to help a local restaurant automate its breakfast billing system. The program should do the following:
// a) Show the customer the different breakfast items offered by the restaurant.
// b) Allow the customer to select more than one item from the menu.
// c) Calculate and print the bill.
// Assume that the restaurant offers the following breakfast items (the price of each item is shown to the right of the item):
// Use an array of structures (you will need to declare another structure inside this one).
// The inside structure will have two members: a character array (string) to store the name of the item and a floating point variable to store the price of the item.
// The outer structure will have two members: an integer variable to store the number of the item ordered and a variable to store the name and price of the item.
// The program should create an array of five structures. The elements should be initialized with the names and prices of the items.
// The program should display a menu that allows the user to select one or more items from the list.    
// (The user can enter the number of each item ordered. The program should read the user’s input and save the user’s input in the array of structures.)
// The program should add the price of the item to the total charge of the customer. Then it should display the total bill.
#include <stdio.h>
#include <string.h>
struct breakfast
{
    char name[20];
    float price;
};
int main()
{
    struct breakfast b[8];
    strcpy(b[0].name, "Plain Egg");
    b[0].price = 50;
    strcpy(b[1].name, "Bacon and Egg");
    b[1].price = 70;
    strcpy(b[2].name, "Muffin");
    b[2].price = 20;
    strcpy(b[3].name, "French Toast");
    b[3].price = 60;
    strcpy(b[4].name, "Fruit Basket");
    b[4].price = 120;
    strcpy(b[5].name, "Cereal");
    b[5].price = 40;
    strcpy(b[6].name, "Coffee");
    b[6].price = 15;
    strcpy(b[7].name, "Tea");
    b[7].price = 10;
    printf("Welcome to Zoro's Restaurant\n");
    printf("1. Plain Egg Rs 50\n");
    printf("2. Bacon and Egg Rs 70\n");
    printf("3. Muffin Rs 20\n");
    printf("4. French Toast Rs 60\n");
    printf("5. Fruit Basket Rs 120\n");
    printf("6. Cereal Rs 40\n");
    printf("7. Coffee Rs 15\n");
    printf("8. Tea Rs 10\n");
    printf("9. Check Out\n");
    int choice;
    int total = 0;
    while(1){
        printf("Please enter your choice: ");
        scanf("%d", &choice);
        if (choice == '9'){
            break;
        }
        total += b[choice - 1].price;
        printf("Add another item? (Y/N) ");
        char ch;
        scanf(" %c", &ch);
        if (ch == 'N' || ch == 'n')
        {
            break;
        }
    }
    printf("Your bill is: Rs %d\n", total);
    return 0;
}

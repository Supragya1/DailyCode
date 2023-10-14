// Day70_Q2.c
// Write a program to create a structure called cricket that will contain the following information:
// Player name
// Team name
// Batting average
// Using cricket, declare an array player with 50 elements and write a program to read the information about all the 50 players and print a team-wise list containing names of players with their batting average.
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct cricket{
    char player_name[100];
    char team_name[100];
    float batting_average;
};
int main(){
    struct cricket player[50];
    int i;
    for(i=0;i<50;i++){
        printf("Enter the name of the player: ");
        scanf("%[^\n]%*c",player[i].player_name);
        printf("Enter the name of the team: ");
        scanf("%[^\n]%*c",player[i].team_name);
        printf("Enter the batting average of the player: ");
        scanf("%f",&player[i].batting_average);
        getchar();//to clear the buffer
    }
    printf("The list of players with their batting average is as follows:\n");
    for(i=0;i<50;i++){
        printf("Player name: %s\n",player[i].player_name);
        printf("Team name: %s\n",player[i].team_name);
        printf("Batting average: %f\n",player[i].batting_average);
    }
    return 0;
}
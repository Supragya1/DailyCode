// Day24_Q1.c
/*Write a program to count the number of vowels
in a text*/
#include<stdio.h>
#include<ctype.h>
int main(){
    char ch[50];
    int count=0,i;
    fgets(ch,50,stdin);
   for( i=0;ch!='\n';i++){
        // tolower(ch);
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
            count++;
        }
    }
    printf("%d",count);
}

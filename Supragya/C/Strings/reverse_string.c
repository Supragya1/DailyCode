// Day56_Q2.c
// Write a c program to write a string in reverse order using recursion.
#include<stdio.h>
#include<string.h>
void reverse(char str[],int start,int end)
{
    if(start>=end)
    {
        return;
    }
    char temp=str[start];
    str[start]=str[end];
    str[end]=temp;
    reverse(str,start+1,end-1);
}
int main()
{
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);
    int len=strlen(str);
    reverse(str,0,len-1);
    printf("The reversed string is: %s",str);
    return 0;
}

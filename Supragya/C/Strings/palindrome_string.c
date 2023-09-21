// Day56_Q1.c
// Write a c program to check whether a string is palindrome or not using recursion.
#include<stdio.h>
#include<string.h>
int palindrome(char str[],int start,int end)
{
    if(start>=end)
    {
        return 1;
    }
    if(str[start]==str[end])
    {
        return palindrome(str,start+1,end-1);
    }
    else
    {
        return 0;
    }
}
int main()
{
    char str[100];
    printf("Enter the string: ");
    scanf("%s",str);
    int len=strlen(str);
    int result=palindrome(str,0,len-1);
    if(result==1)
    {
        printf("The string is palindrome");
    }
    else
    {
        printf("The string is not palindrome");
    }
    return 0;
}
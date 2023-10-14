// Day71_Q2.c
// Write a program to list all the files in the given directory along with their length and last modification time. 
// The output should contain one file name per line.
#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <sys/stat.h>
#include <time.h>
int main(){
    DIR *d;
    struct dirent *dir;
    struct stat fileStat;
    d = opendir(".");
    if (d){
        while ((dir = readdir(d)) != NULL){
            stat(dir->d_name,&fileStat);
            printf("%s\t%ld\t%s",dir->d_name,fileStat.st_size,ctime(&fileStat.st_mtime));
        }
        closedir(d);
    }
    return(0);
}
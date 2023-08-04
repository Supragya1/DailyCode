// Structure
#include<stdio.h>
#include<string.h>
struct student{
 char name[30];
 float marks;
 int age;
 float CGPA;
};

int main(){
    int n;
    printf("Enter the number of students You want to take entry of \n");
    scanf("%d",&n);
  struct student s[n];
  for(int i=0;i<n;i++){
    printf("Enter name of student\n");
    scanf("%s",s[i].name);
    printf("Enter marks Scored by Student out of 100\n");
    scanf("%f",&s[i].marks);
    printf("Enter age of the student\n");
     scanf("%d",&s[i].age);
    printf("Enter the CGPA of the student\n");
    scanf("%f",&s[i].CGPA);
  }


     struct student temp;
   temp = s[0];
  for(int i=0;i<n;i++){
  if(s[i].CGPA<s[i+1].CGPA){
    temp = s[i+1];
  }
  }
  printf("\nTHE topper has scored %.2f marks and %.2f CGPA and his name is %s \n\n",temp.marks,temp.CGPA,temp.name);
  


    struct student x;
for(int j=0;j<n-1;j++){
   for(int i=0;i<n-1;i++){
    if( s[i].marks > s[(i+1)].marks){
        x = s[i];
        s[i]=s[(i+1)];
        s[(i+1)]=x;
    }
   }
}
printf("Students Details in ascending order of their marks\n");
 for(int i=0;i<n;i++){
    printf("Student name : %s \n",s[i].name);
    printf("Marks Scored by %s : %f \n",s[i].name,s[i].marks);
    printf("Age of %s : %d \n",s[i].name,s[i].age);
    printf("CGPA Score by %s : %.2f \n",s[i].name,s[i].CGPA);
    printf("\n\n");
    }


   char st[30];
  printf("Enter the name of the student you want to search for\n");
  scanf("%s",st);
 for(int i=0;i<n;i++){
  if(strcmp(st, s[i].name)==0){
    printf("a");
  }
 }
}

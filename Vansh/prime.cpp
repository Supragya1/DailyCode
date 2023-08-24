#include<iostream>
using namespace std;

  int main(){
   
   int i,n;
   cin>>n;
   
   bool flag = 0;
   
   for(i=2;i<n;i++){
   	
   	if(n%i==0){
  	  cout<<"Non - Prime"<<endl;
  	  flag = 1;
  	  break;	   
   	}
   }
  
    if(flag==0){
    cout<<"Prime"<<endl;
    }
  
  } 

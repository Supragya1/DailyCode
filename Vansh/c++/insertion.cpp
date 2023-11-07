#include<iostream>
using namespace std;
int main(){
int i,j,n;

cout<<"Enter the Size Of Array : ";
cin>>n;

int arr[n];

cout<<"Enter the Array "<<endl;

for(i=0;i<n;i++){
cin>>arr[i];
}

//insertion sort 

for(i=1;i<n;i++){
for(j=i;j>0;j--){
if(arr[j]<arr[j-1]){
swap(arr[j],arr[j-1]);
}

}
}

cout<<"Sorted Array is :";

for(i=0;i<n;i++){
cout<<arr[i];
}

cout<<endl;
}

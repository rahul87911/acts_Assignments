#include<iostream>
using namespace std;

int main ()
{

int n,i;
int sum=0;

cout<<"Enter the number:";
cin>>n;

for(i=1;i<n;i++)

if(n%i==0){
sum=sum+i;
}

if(sum==n){
cout<<"Entered number is a Perfect Number";
}
else
cout<<"Sorry number entered is not perfect";

return 0;
}

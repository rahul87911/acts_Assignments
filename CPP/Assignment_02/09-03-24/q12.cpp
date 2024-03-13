#include<iostream>
using namespace std;

int main()
{
int n,d,c,sum=0;
cout<<"Enter the number:"<<endl;
cin>>n;
c=n;

while(n>0)
{
d=n%10;
sum=sum+(d*d*d);
n=n/10;
}

if(sum==c)
{
cout<<"Entered number is an Armstrong Number.";
}
else
cout<<"Sorry!! Entered number is not an Armstrong Number.";

	return 0;
}


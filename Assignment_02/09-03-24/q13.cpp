#include<iostream>
using namespace std;

int main()
{
int n,i=1,k=0;

cout<<"Enter the number:"<<endl;
cin>>n;

if(n==0 || n==1)
{cout<<"Entered number is not Prime.";
}

else if(n>=2){

while(i<=n)
{
if(n%i==0)
{
k=k+1;
}

i++;
}


if(k>2)
	cout<<"Entered number is Composite"<<endl;
	else if(k<=2)
	cout<<"Entered number is Prime";
	}
return 0;
}

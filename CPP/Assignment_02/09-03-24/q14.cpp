#include<iostream>
using namespace std;

int main()
{
int l,b,i,j;

cout<<"Enter the length and breadth of rectangle:"<<endl;
cin>>l>>b;

if(l==0 || b==0)
{cout<<"Entered dimensions are invalid!!";}

else
{
for(i=1;i<=b;i++)
{
	cout<<endl;
	for(j=1;j<=l;j++)
	{
		cout<<"*";
	}
}
}
	return 0;
}



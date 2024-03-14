#include<iostream>
using namespace std;

void swap(int &x, int &y )
{
	int temp=x;
	x=y;
        y=temp;

}


int main()
{       int a,b;
	cout<<"Enter Values:"<<endl;
	cin>>a>>b;
	cout<<"Values before Swapping: A= "<<a<<" B= "<<b<<endl;
	swap(a,b);
	cout<<"Values after swapping: A= "<<a<<" B= "<<b<<endl;
	return 0;

}

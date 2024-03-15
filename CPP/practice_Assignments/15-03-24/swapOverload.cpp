#include<iostream>
using namespace std;
void swap( int a, int b = 0, int c =0) //overloading with default constructor
{
	c=a;
	a=b;
	b=c;
}
void swap1( int a, int b, int) //overloading with placeholder
{
	int c=a;
	a=b;
	b=c;
}
void swap1( int a, int b) 
{
    int temp = a;
    a = b;
    b = temp;
}
int main()
{    int x,y,z;
     cout<<"Enter the number:"<<endl;
     cin>>x>>y;
     cout<<"Numbers before swap A: "<<x<<" B "<<y<<endl;
	swap1(x, y);
     cout<<"Numbers after swap  A: "<<x<<" B "<<y<<endl;   
	swap(x, y);
     cout<<"Numbers after second swap  A: "<<x<<" B "<<y<<endl; 
	swap1(x, y,z);
     cout<<"Numbers after third swap  A: "<<x<<" B "<<y<<endl; 
	return 0;
}

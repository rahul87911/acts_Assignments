#include<iostream>
using namespace std;

int main()
{

int a;
int b;
int c;

cout<<"Enter the numbers a & b=" <<endl;
cin>>a;
cin>>b;
cout<<"Before swapping a =" <<a << ", b =" <<b <<endl;

c=a;
a=b;
b=c;

cout<<"The values after swapping a = "<< a << " , b = "<< b ; 


return 0;
}

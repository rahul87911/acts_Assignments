#include<iostream>
using namespace std;

int main()
{
int a,b,c;
cout<<"Enter two numbers:"<<endl;
cin>>a>>b;
cout<<"Values before swapping a="<<a",b="<<b<<endl;
c=a;
a=b;
b=c;

cout<<"Values after swapping a="<<a",b="<<b<<endl;

return 0;
}

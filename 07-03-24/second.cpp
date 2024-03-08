#include<iostream>
using namespace std ;
int main()
{
int a;
int b;
cout<<"enter the value"<<endl;
cin>>a;
cin>>b;
cout<<"Values before swapping a="<<a<<", b="<<b <<endl ;

b=a+b;

a=b-a;

b= b-a;

cout<<"Values after swapping a="<<a<<",b="<<b <<endl;


return 0;

}

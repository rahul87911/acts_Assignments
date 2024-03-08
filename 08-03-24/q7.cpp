#include<iostream>
using namespace std ;

int main()
{
int a;
cout<<"Enter the year:"<<endl;
cin>>a;




if(a%4==0 && a%100==0)
{
cout<<"Entered year is a century leap year";
}
else if(a%4==0)
{
cout<<"Entered year is a leap year";
}
else
cout<<"Entered year is an ordinary year";


return 0;
}

#include<iostream>
using namespace std;

int main()
{
int a,b,c,d,e;
int sum;
float avg;

cout<<"Enter the numbers in five subjects"<<endl;
cin>>a>>b>>c>>d>>e;

sum=(a+b+c+d+e);

avg=sum/5;      //implicit conversion

cout<<"Average of five subjects is"<<avg<<endl;


avg=(float)sum/5;  //explicit conversion

cout<<"Average of five numbers is"<<avg<<endl; 




return 0;
}

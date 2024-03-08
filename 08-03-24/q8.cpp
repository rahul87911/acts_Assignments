#include<iostream>
using namespace std;

int main()
{
int b,s;
double c,t;
cout<<"Enter the basic salary:"<<endl;
cin>>b;
cout<<"Enter total sales amount:"<<endl;
cin>>s;

if(s>=5000 && s<=7500)
{
c=3.33*s;
t=b+c;
}
else if(s>=7501  && s<=10500)
{
c=0.08*s;
t=b+c;
}
else if(s>=10501  && s<=15000)
{
c=0.11*s;
t=b+c;
}
else if(s>=15000)
{
c=0.15*s;
t=b+c;
}
else
{
c=0;
t=b+c;
}

cout<<"Total salary is"<<t;

return 0;
}

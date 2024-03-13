#include<iostream>
using namespace std;

int main()
{
int a,b,c;
cout<<"Enter three numbers:"<<endl;
cin>>a>>b>>c;

if(a>b)
{
if(a>c)
{
cout<<"Greatest values is"<<a<<endl; 
}
else{
cout<<"Greatest value is"<<c<<endl; 
}
}

else{
if(b>c)
{
cout<<"Greatest value is"<<b<<endl;
}
else {
cout<<"Greatest value is"<<c<<endl;
}
}

return 0;
}

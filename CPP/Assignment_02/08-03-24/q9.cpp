#include<iostream>
using namespace std;

int main()
{
int a,b,c,d,e;

cout<<"Welcome user!!\n Enter two numbers:"<<endl;
cin>>a>>b;

while(c!=5)
{
cout<<"Press 1 for Addition\n Press 2 for Substraction\n Press 3 for Multiplication\nPress 4 for Division\n Press 5 to Exit\n Your Input:"<<endl;
cin>>c;

switch(c)
{
case 1:
{
d=a+b;
cout<<"Sum ="<<d;
break;
}

case 2:
{
d=a-b;
cout<<"Difference ="<<d;
break;
}

case 3:
{
d=a*b;
cout<<"Product ="<<d;
break;
}

case 4:
{
d=a/b;
e=a%b;
cout<<"Quotient ="<<d<<endl;
cout<<"Remainder ="<<e;
break;
}

case 5:
{
cout<<"Thank You !!";
break;
}

default :
{
cout<<"Invalid Input";
break;
}

}

}


return 0;
}

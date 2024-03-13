#include<iostream>
using namespace std;

int main()
{

	int m=21,p,c;

	while(m!=1){
	cout<<"There are 21 matchsticks, choose either 1,2,3 or 4 :"<<endl;
	cin>>p;
	if(p==0 || p>4)
	{cout<<"Invalid Input, Choose within 1 to 4"<<endl;
		continue;
	}

	m=m-p;
	c=5-p;
	cout<<"Computer has chosen"<<c <<endl;
	cout<<"Currently Only"<<m<<"matchsticks are left"<<endl;
	m=m-c;
       }

		if(m==1){
			cout<<"Only"<<m<<"matchstick left, you loose !!" <<endl;

		}
	return 0;
}

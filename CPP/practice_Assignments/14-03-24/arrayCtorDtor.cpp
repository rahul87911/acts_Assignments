#include<iostream>
using namespace std;

class Array
{
	private:
		int *p;
		int size;
	public:
		Array(int s)              //param-CTOR
		{
			size = s;
			p = new int[size];
			cout<<"\n CTOR called"<<endl;
		}

		int getAtIndex(int index)   //accessor
		{
			return p[index];
		}

		void setAtIndex(int index, int value)  //setter
		{
			p[index] = value;
		}
                   		
		~Array()             //DTOR
		{
			cout<<"\n DTOR called"<<endl;
			delete [] p;
		}
};


int main()
{

	Array a(2);
	a.setAtIndex(0, 100);     //setting value 100 at 0 index
	a.setAtIndex(1, 200);
	cout<<"\n Value="<<a.getAtIndex(0);   //getting value from 0 index


	cout<<"\n Value="<<a.getAtIndex(0);
	cout<<"\n Program is going to exit"<<endl;  //DTOR will be called
	return 0;
}

#include<iostream>
using namespace std;

class Employee
{
	static int count;

	public:

	Employee(){
		count++;
	}


	static void number(){
		cout<<"Number of Employees: "<<count<<endl;
	}
};

int Employee::count=0;
int main()
{ 
	Employee e[10];
	e[0].number();
	return 0;
}

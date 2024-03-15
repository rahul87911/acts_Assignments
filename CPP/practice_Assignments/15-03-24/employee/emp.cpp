#include<iostream>
using namespace std;

class Employee
{
	
	private: int empn;
	         int salary;

	public:

	Employee(){
	}
        
        Employee(int empn, int salary){                   //constructor overloading
                empn=0;
                salary=0;
	}
	
	int getEmpn(){
	return empn;
	}
	
	int getSal(){
	return salary;
	}
	
	Employee(const Employee& other) : empn(other.empn), salary(other.salary) {}  //copy CTOR
	
};


int main()
{ 
	    Employee e1;

            Employee e2 = e1;
            
            cout<<"Employee:"<<e1.getEmpn()<<endl<<e1.getSal()<<endl;
            cout<<"Copied Employee:"<<e2.getEmpn()<<endl<<e2.getSal()<<endl;
	
	
	return 0;
}

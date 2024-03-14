#ifndef EMP_H
#define EMP_H
#include<iostream>
#include<string>
using namespace std;

class Employee
{
	
        private:
                int empn;
                string name;
                int salary;

	public:

	        Employee();
                int getEmpn();
             
                string getName();
                int getSalary();

	        void input();		
	        void display();
		
};
#endif



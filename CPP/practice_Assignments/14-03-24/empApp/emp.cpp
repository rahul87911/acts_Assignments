#include<iostream>
#include<string>
#include"emp.h"
using namespace std;


	Employee::Employee(){
	        empn=0;
	        name=" ";
	        salary=0;
	        }
	        
        int Employee::getEmpn(){
                return empn;
                }
             
        string Employee::getName(){
                return name;
                }
             
        int Employee::getSalary(){
                return salary;
                }

	void Employee::input(){
	        cout<<"Enter Employee No :"<<endl;
		cin>>empn;

		cout<<"Enter Name :"<<endl;
		cin.ignore();
		getline(cin, name);
	
		cout<<"Enter Salary :"<<endl;
		cin>>salary;
		}
		
	void Employee::display()
		{cout<<"Employee No: "<<empn<<" Name: "<<name<<" Salary: "<<salary<<endl;}
	




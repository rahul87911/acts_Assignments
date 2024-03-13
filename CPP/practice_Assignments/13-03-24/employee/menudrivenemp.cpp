#include<iostream>
#include<string>
using namespace std;

class Employee
{
	static int count;
        private:
                int empn;
                string name;
                int salary;

	public:

	Employee(){
	        empn=0;
	        name=" ";
	        salary=0;
		count++;
	}
             int getEmpn(){
             return empn;
             }
             
             string getName(){
             return name;
             }
             
             int getSalary(){
             return salary;
             }

	static void number(){
		cout<<"Number of Employees: "<<count<<endl;
	}
	
	void input()
		{cout<<"Enter Employee No :"<<endl;
		 cin>>empn;

		 cout<<"Enter Name :"<<endl;
		 cin.ignore();
		 getline(cin, name);
		

		 cout<<"Enter Salary :"<<endl;
		 cin>>salary;

		}
		
	void display()
		{cout<<"Employee No: "<<empn<<" Name: "<<name<<" Salary: "<<salary<<endl;}
	
};

int Employee::count=0;
int main()
{ 
        int n;
	Employee e[10];
	
	do
                        {	

			 cout<<"Menu:"<<endl<<"1: Input Employee details"<<endl<<"2: Display all Employee details"<<endl<<"3: Show Number of Employees"<<endl<<"4: Exit"<<endl;

			 cin>>n;

			 switch(n)
			 {
                case 1:
				   {
                      for(int i=0;i<10;i++)
				      {e[i].input();}
				      break;
				   }

		           case 2:
				   {
				       for(int i=0;i<10;i++)
				       {e[i].display();}
			               break;
				   }

		          case 3:
				   {
                                       e[0].number();
					 break;
				   }

			  case 4:
				   {
                                     cout<<"Thank You!! Have a Nice Day..."<<endl;
                                     return 0;
				   }
				   }
				   }while(n!=4);
	
	return 0;
}

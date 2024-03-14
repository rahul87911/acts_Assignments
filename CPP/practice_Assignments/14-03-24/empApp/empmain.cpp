#include<iostream>
#include<string>
#include"util.h"
using namespace std;


int main()
{ 
        int n,i;
	Employee e[2];
	
   do{	
	cout<<"Menu:"<<endl<<"1: Input Employee details"<<endl<<"2: Display all Employee details"<<endl<<"3: Sort Employees according to Salary"<<endl<<"4: Exit"<<endl;
        cin>>n;

	switch(n){
           case 1:
                 {
                   for(int i=0;i<2;i++)
                   {e[i].input();}
                   break;
	         }

           case 2:
	         {
                   for(int i=0;i<2;i++)
	           {e[i].display();}
	           break;
	         }
           case 3:
	         {
                   sortEmpSalary(e, 2);
                    for(int i=0;i<2;i++)
	           {e[i].display();}
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

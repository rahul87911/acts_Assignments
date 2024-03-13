#include<iostream>
#include"student.h"
using namespace std;

int main()       
{ 
	int size,n;

             cout<<"Welcome!! Enter the number of Students:"<<endl;
			 cin>>size;
                 Student arr[size];

		       do
                        {	

			 cout<<"Menu:"<<endl<<"1: Input Student details"<<endl<<"2: Display all Student details"<<endl<<"3: Sort Students by Roll No."<<endl<<"4: Sort Students by Marks"<<endl<<"5: Sort Students by Names"<<endl<<"6: Exit"<<endl;

			 cin>>n;

			 switch(n)
			 {
                case 1:
				   {
                      for(int i=0;i<size;i++)
				      {arr[i].input();}
				      break;
				   }

		           case 2:
				   {
				       for(int i=0;i<size;i++)
				       {arr[i].display();}
			               break;
				   }

		          case 3:
				   {
                        arr[size].sortStudentsRoll(arr, size);
					 cout<<"Sorted Students according to Roll No.:"<<endl;
					 for(int i=0;i<size;i++)
					 {
						 arr[i].display();
					 }
					 break;
				   }

			  case 4:
				   {
                        arr[size].sortStudentsMarks(arr, size);
					  cout<<"Sorted Students according to Marks:"<<endl;
					  for(int i=0;i<size;i++)
					  {
						  arr[i].display();
					  }
					  break;
				   }

			  case 5:
				   {
                      arr[size].sortStudentsName(arr, size);
					  cout<<"Sorted Students according to Names:"<<endl;
					  for(int i=0;i<size;i++)
					  {
						  arr[i].display();
					  }
					  break;
				   }

		          case 6:
				   {
                        cout<<"Thank You !! Have a nice day..."<<endl;
					 return 0;
				   }

			  default:
				   {
                                         cout<<"Invalid Input !! Try Again..."<<endl;
					 break;
				   }
			}
	 		}while(n!=6);
	 		
		       return 0;
	       }

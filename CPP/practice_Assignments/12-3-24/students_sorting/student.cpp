#include<string>
#include<iostream>
using namespace std;

class Student
{
	private:
		int roll;
		string name;
		int marks;
		int cla;

	public:
		Student(){
			roll=0;
			name=" ";
			marks=0;
			cla=0;
		          }


		int getRoll(){
			return roll;
		}

		int getMarks(){
			return marks;
		}

		string getName(){
			return name;
		}



		void input()
		{cout<<"Enter Roll No :"<<endl;
		 cin>>roll;

		 cout<<"Enter Name :"<<endl;
		 cin.ignore();
		 getline(cin, name);
		

		 cout<<"Enter Class :"<<endl;
		 cin>>cla;

		 cout<<"Enter Marks :"<<endl;
		 cin>>marks;
		}
		
		

		void display()
		{cout<<"Roll No: "<<roll<<" Name: "<<name<<" Class: "<<cla<<" Marks "<<marks<<endl;}

                
		void sortStudentsRoll(Student arr[], int length)
		{
			for(int i=0;i<length;i++)
			{
				for( int j=0;j<length-i-1;j++)
				{
					if(arr[j].getRoll()>arr[j+1].getRoll())
					{Student c;
						c=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=c;
					}
				}
			}
		}


               void sortStudentsMarks(Student arr[], int length)
	       {
		       for(int i=0; i<length;i++)
		       {
			       for (int j=0;j<length-i-1;j++)
			       {
				       if(arr[j].getMarks()>arr[j+1].getMarks())
				       {Student c;
					       c=arr[j];
					       arr[j]=arr[j+1];
					       arr[j+1]=c;
				       }
			       }
		       }
	       }

	       void sortStudentsName(Student arr[], int length)
	       {
		       for(int i=0;i<length;i++)
		       { 
			       for(int j=0;j<length-i-1;j++)
			       {
				       if(arr[i].getName()>arr[j].getName())
				       {Student c;
					       c=arr[j];
					       arr[j]=arr[j+1];
					       arr[j+1]=c;
				       }
			       }
		       }
	       }
};




	       int main()
	       { int size,n;

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

#include<string>
#include<iostream>
#include"student.h"
using namespace std;

Student::Student(){
			roll=0;
			name=" ";
			marks=0;
			cla=0;
		          }


		int Student::getRoll(){
			return roll;
		}

		int Student::getMarks(){
			return marks;
		}

		string Student::getName(){
			return name;
		}



		void Student::input()
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
		
		

		void Student::display()
		{cout<<"Roll No: "<<roll<<" Name: "<<name<<" Class: "<<cla<<" Marks "<<marks<<endl;}

                
		void Student::sortStudentsRoll(Student arr[], int length)
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


               void Student::sortStudentsMarks(Student arr[], int length)
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

	       void Student::sortStudentsName(Student arr[], int length)
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



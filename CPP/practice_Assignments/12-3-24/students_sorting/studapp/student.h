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
		Student();
		int getRoll();
		string getName();
		
	       void input();
	       void display();
               void sortStudentsRollNo(Student arr[], int length);
               void sortStudentsMarks(Student arr[], int length);
	       void sortStudentsName(Student arr[], int length);
};

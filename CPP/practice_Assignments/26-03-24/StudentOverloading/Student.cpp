#include<iostream>
#include<string>
using namespace std;

class Student
{
	private:
		int rollNo;
		string name;
		int marks;
	public:

		//Constructor
		Student()
	       	{
		rollNo =0;
		name = "";
		marks = 0;
		}
		
		//parameterized constructor
		Student(int rno, string nm, int mk)
	       	{
		rollNo = rno;
		name = nm;
		marks = mk;
		}

                //accessor
		int getRollNo()
		{
			return rollNo;
		}

                //member-functions
		void accept()
		{
			cout<<"\n Enter rollNo:"<<endl;
			cin>>rollNo;
			cout<<"\n Enter name:"<<endl;
			cin.get();
			getline(cin, name);
			cout<<"\n Enter Marks:"<<endl;
			cin>>marks;

		}

		void display()
		{

                        cout<<"\nRollNo:"<<rollNo<<" Name:"<<name<<" Marks:"<<marks<<endl;

		}
		
		// Overload insertion operator <<
               friend ostream& operator<<(ostream& os, const Student& student) {
                      os << "RollNo: " << student.rollNo << ", Name: " << student.name << ", Marks: " << student.marks;
                      return os;
                      }
    
               // Overload extraction operator >>
              friend istream& operator>>(istream& is, Student& student) {
                     cout << "\nEnter rollNo:" << endl;
                     is >> student.rollNo;
                     cout << "\nEnter name:" << endl;
                     is.get();
                     getline(is, student.name);
                     cout << "\nEnter Marks:" << endl;
                     is >> student.marks;
                     return is;
                     }

};

void sortStudents(Student arr[], int length)
{
	for(int i=0 ; i < length; i++)
	{
		for(int j = i+1 ; j < length; j++)
		{
		if(arr[i].getRollNo() > arr[j].getRollNo()) {
		Student temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
	}
}

int main()
{
	Student s;
        cout << "Enter details for student s:" << endl;
        cin >> s;
        cout << "Details of student s:" << endl;
        cout << s << endl;

        Student s1(5, "Ram", 100);
        cout << "Details of student s1:" << endl;
        cout << s1 << endl;


	return 0;
}

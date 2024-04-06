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

		//CTOR
		Student()
	       	{
		cout<<"\n CTOR called"<<endl;
		rollNo =0;
		name = "";
		marks = 0;
		}
		
		Student(int rno, string nm, int mk)
	       	{
		cout<<"\n PARAM CTOR called"<<endl;
		rollNo = rno;
		name = nm;
		marks = mk;
		}

		int getRollNo()
		{
			return rollNo;
		}

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
		void doStudy()
		{
			cout<<"\n Student is studying::"<<rollNo<<endl;
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
	//Default ctor
	Student s;
	s.display();

	//Param ctor
	Student s1(5,"Ram", 100);
	s1.display();


/*	s.accept();
	s.doStudy();
	s.display();

*/
	int size =3;
	Student sarr[size];
/*	for( int i =0; i < size; i++)
	{
	sarr[i].accept();
	}

	for( int i =0; i < size; i++)
	{
	sarr[i].display();
	}

	sortStudents(sarr, size);
cout<<"\n *******************************"<<endl;
	for( int i =0; i<size; i++)
	{
	sarr[i].display();
	}*/
	return 0;
}

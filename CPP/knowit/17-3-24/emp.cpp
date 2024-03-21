#include <iostream>
#include <string>

using namespace std;


struct Employee {
    string name;
    double salary;

    
    void acceptData() {
        cout << "Enter details for employee:\n";
        cout << "Name: ";
        cin>>name;
        cout << "Salary: ";
        cin >> salary;
        cout << endl;
    }

    
    void displayData() {
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl << endl;
    }
};

int main() {
    // Create an array to hold data for 5 employees
    Employee employees[5];

   
    for (int i = 0; i < 5; ++i) {
        cout << "Enter details for employee " << i + 1 << ":\n";
        employees[i].acceptData();
    }

    
    cout << "Details of 5 employees:\n";
    for (int i = 0; i < 5; ++i) {
        cout << "Employee " << i + 1 << ":\n";
        employees[i].displayData();
    }

    return 0;
}


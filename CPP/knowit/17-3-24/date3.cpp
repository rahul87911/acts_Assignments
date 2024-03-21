#include <iostream>
using namespace std;

class Date {
private:
    int day;
    int month;
    int year;

public:
    // Constructor with no arguments
    Date()  {
    day=1;
    month=1;
    year=2014;
    }

    // Constructor with one argument
    Date(int a)  {
    day=1;
    month=1;
    year=2024;
    }

    // Member function to display the date
    void getDate()  {
        cout << "Date: " << day << "/" << month << "/" << year << endl;
    }
};

int main() {
    // Create objects of Date class using different constructors
    
    Date date1;   // Object with no arguments
    
    Date date2(1); // Object with one argument

    // Display dates
    cout << "Date 1: ";
    date1.getDate();

    cout << "Date 2: ";
    date2.getDate();

    return 0;
}


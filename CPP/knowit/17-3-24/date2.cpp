#include <iostream>
using namespace std;

class Date {
private:
    int day;
    int month;
    int year;

public:
    // Constructor to initialize data members
    Date(int d, int m, int y)  {
    day=0;
    month=0;
    year=0;
    
    }

    
    int getDay()  {
        return day;
    }

  
    void setDay(int d) {
        day = d;
    }

    
    int getMonth()  {
        return month;
    }

    
    void setMonth(int m) {
        month = m;
    }

    
    int getYear()  {
        return year;
    }

    
    void setYear(int y) {
        year = y;
    }

    // Member function to display the date
    void getDate()  {
        cout << "Date: " << day << "/" << month << "/" << year << endl;
    }
};

int main() {
    // Create an object of Date class
    Date date(17, 3, 2024);

    // Display the initial date
    cout << "Initial ";
    date.getDate();

    
    date.setDay(25);
    date.setMonth(12);
    date.setYear(2025);

    // Display the updated date
    cout << "Updated ";
    date.getDate();

    return 0;
}


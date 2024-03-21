#include <iostream>
using namespace std;

class Date {
private:
    int day;
    int month;
    int year;

public:
    
    Date(int d, int m, int y) {
    day=0;
    month=0;
    year=0;
    }

   
    void getDate() {
        cout << "Date: " << day << "/" << month << "/" << year << endl;
    }

   
    void setDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
};

int main() {
    // Create an object of Date class
    Date date(17, 3, 2024);

    // Display the initial date
    cout << "Initial ";
    date.getDate();

    // Set a new date
    date.setDate(25, 12, 2025);

    // Display the updated date
    cout << "Updated ";
    date.getDate();

    return 0;
}


#include <iostream>
using namespace std;
struct Student {
    int rollNumber;
    char name[50];
    int totalMarks;
};

void acceptData(Student students[], int n) {
    for (int i = 0; i < n; ++i) {
        cout << "Enter details for student " << i + 1 << ":" << std::endl;
        cout << "Roll Number: ";
        cin >> students[i].rollNumber;
        cout << "Name: ";
        cin>>students[i].name[50];
        cin.getline(students[i].name, 50);
        cout << "Total Marks: ";
        cin >> students[i].totalMarks;
    }
}

void displayData(Student students[], int n) {
    cout << "\nStudent Details:\n";
    for (int i = 0; i < n; ++i) {
        cout << "Roll Number: " << students[i].rollNumber << std::endl;
        cout << "Name: " << students[i].name << std::endl;
        cout << "Total Marks: " << students[i].totalMarks << std::endl;
        cout <<endl;
    }
}

int findMaxMarks(Student students[], int n) {
    int maxMarks = students[0].totalMarks;
    int maxIndex = 0;

    for (int i = 1; i < n; ++i) {
        if (students[i].totalMarks > maxMarks) {
            maxMarks = students[i].totalMarks;
            maxIndex = i;
        }
    }

    return maxIndex;
}

int main() {
    Student students[5];

    acceptData(students, 5);
    displayData(students, 5);

    int maxIndex = findMaxMarks(students, 5);
    cout << "Student with Maximum Marks:\n";
    cout << "Roll Number: " << students[maxIndex].rollNumber << std::endl;
    cout << "Name: " << students[maxIndex].name << std::endl;
    cout << "Total Marks: " << students[maxIndex].totalMarks << std::endl;

    return 0;
}


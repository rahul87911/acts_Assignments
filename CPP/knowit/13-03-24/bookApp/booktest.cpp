#include<iostream>
#include<string>
#include"book.h"
using namespace std;

int main() {
    int n;
    Book b[n];
    cout<<"Enter number of books:"<<endl;
    cin>>n;

    for (int i = 0; i < n; ++i) {
        cout << "\nEnter details for Book " << i + 1 << endl;
        b[i].input();
    }

    cout << "\nDetails of all books:" << endl;
    for (int i = 0; i < n; ++i) {
        cout << "\nBook " << i + 1 << endl;
        b[i].display();
    }
    return 0;
    }

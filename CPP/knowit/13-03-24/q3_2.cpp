#include<iostream>
#include<string>
using namespace std;

class Book
{
  private:
           int bn;
           string name;
           int price;
           
  public:
          Book(){}  //no-arg constructor
                  
          Book(int number, string name, int price) {   //parameterized constructor
                 bn =7;
                 name = "n";
                 price =8;
              }
              
          void input() {
                 cout << "Enter Book number: ";
                 cin>>bn;
                 cout << "Enter Book name: ";
                 cin>>name;
                 cout << "Enter Book price: ";
                 cin>>price;
              }
              
          void display() {
                 cout << "Book number: " <<bn << endl;
                 cout << "Book name: " <<name << endl;
                 cout << "Book price: " <<price << endl;
              }

};

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

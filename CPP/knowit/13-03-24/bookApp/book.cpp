#include<iostream>
#include<string>
#include"book.h"
using namespace std;


          Book::Book(){}  //no-arg constructor
                  
          Book::Book(int number, string name, int price) {   //parameterized constructor
                 bn =7;
                 name = "n";
                 price =8;
              }
              
          void Book::input() {
                 cout << "Enter Book number: ";
                 cin>>bn;
                 cout << "Enter Book name: ";
                 cin>>name;
                 cout << "Enter Book price: ";
                 cin>>price;
              }
              
          void Book::display() {
                 cout << "Book number: " <<bn << endl;
                 cout << "Book name: " <<name << endl;
                 cout << "Book price: " <<price << endl;
              }





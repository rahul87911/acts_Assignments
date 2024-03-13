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
          Book();  //no-arg constructor     
          Book(int number, string name, int price);  //parameterized constructor
               
          void input();     
          void display(); 

};


#include <iostream>
using namespace std;

class Calculator {
private:
    int no1;
    int no2;

public:
    
    Calculator(int n1, int n2) {
    no1=0;
    no2=0;
    }

    
    void acceptValues() {
        cout << "Enter two numbers: ";
        cin >> no1 >> no2;
    }

    
    void displayValues()  {
        cout << "Number 1: " << no1 << endl;
        cout << "Number 2: " << no2 << endl;
    }

    
    int add(int, int)  {
        return no1 + no2;
    }

    int getN1(){
    return no1;}
    
    int getN2(){
    return no2;}
   
    
};

int main() {
    
    Calculator calc(0, 0); // Initial values are 0, 0
 
    // Accept and display values
    calc.acceptValues();
    cout << "Entered values:\n";
    calc.displayValues();
      int a,b;
   a=calc.getN1();
   b=calc.getN2();

    // Perform operations and display results
    cout << "Addition result: " << calc.add(a,b) << endl;
   

    return 0;
}


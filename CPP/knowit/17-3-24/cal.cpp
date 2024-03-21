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

    
    int add()  {
        return no1 + no2;
    }

    
    int subtract()  {
        return no1 - no2;
    }

   
    int multiply()  {
        return no1 * no2;
    }

    
    int divide()  {
        if (no2 != 0) {
            return no1 / no2;
        } else {
            cout << "Error: Division by zero!" << endl;
            return 0.0;
        }
    }
};

int main() {
    
    Calculator calc(0, 0); // Initial values are 0, 0
   
    // Accept and display values
    calc.acceptValues();
    cout << "Entered values:\n";
    calc.displayValues();

    // Perform operations and display results
    cout << "Addition result: " << calc.add() << endl;
    cout << "Subtraction result: " << calc.subtract() << endl;
    cout << "Multiplication result: " << calc.multiply() << endl;
    cout << "Division result: " << calc.divide() << endl;

    return 0;
}


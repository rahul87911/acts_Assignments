#include <iostream>
using namespace std;

class Complex {
private:
    int real;
    int imaginary;

public:
    // Default constructor
    Complex() {
    real=0;
    imaginary=0;
    }

    // Parameterized constructor
    Complex(int r, int i) {
    real=r;
    imaginary=i;
    }

    // Getter function for real part
    int getReal() {
        return real;
    }

    // Setter function for real part
    void setReal(int r) {
        real = r;
    }

    // Getter function for imaginary part
    int getImaginary()  {
        return imaginary;
    }

    // Setter function for imaginary part
    void setImaginary(int i) {
        imaginary = i;
    }

    // Display function
    void display()  {
        cout << "Complex number: " << real << " + " << imaginary << "i" << endl;
    }
};

int main() {
    // Create objects of Complex class using different constructors
    Complex c1;         // Default constructor
    Complex c2(2,3); // Parameterized constructor

    // Display complex numbers
    cout << "Complex number 1: ";
    c1.display();

    cout << "Complex number 2: ";
    c2.display();

    // Modify complex numbers using setter functions
    c1.setReal(5);
    c1.setImaginary(4);

    // Display modified complex number
    cout << "Modified Complex number 1: ";
    c1.display();

    return 0;
}


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

    // Overloading + operator for addition
    Complex operator+( const Complex& other) const {
        return Complex(real + other.real, imaginary + other.imaginary);
    }

    // Overloading - operator for subtraction
    Complex operator-( const Complex& other)  const {
        return Complex(real - other.real, imaginary - other.imaginary);
    }

    // Overloading * operator for multiplication
    Complex operator*( const Complex& other) const {
        int newReal = (real * other.real) - (imaginary * other.imaginary);
        int newImaginary = (real * other.imaginary) + (imaginary * other.real);
        return Complex(newReal, newImaginary);
    }

    // Overloading prefix increment operator
    Complex& operator++() {
        ++real;
        ++imaginary;
        return *this;
    }

    // Overloading postfix increment operator
    Complex operator++(int) {
        Complex temp = *this;
        ++(*this);
        return temp;
    }
    
    //overloading == operator
    bool operator==(const Complex &other) const {
        return (real == other.real) && (imaginary == other.imaginary);
    }
    
    //overloading != operator
    bool operator!=(const Complex &other) const {
        return !(*this == other);
    }

    // Display function
    void display()  {
        cout << "Complex number: " << real << " + " << imaginary << "i" << endl;
    }
};

int main() {
    // Create objects of Complex class
    Complex c1(3, 2);
    Complex c2(1, 4);

    // Perform addition, subtraction, and multiplication
    Complex result_add = c1 + c2;
    Complex result_sub = c1 - c2;
    Complex result_mul = c1 * c2;


    // Display results
    cout << "Addition result: ";
    result_add.display();

    cout << "Subtraction result: ";
    result_sub.display();

    cout << "Multiplication result: ";
    result_mul.display();
    
    // Test pre and post increment operators
    cout << "Initial c1: ";
    c1.display();
    cout << "Pre-incrementing c1: ";
    (++c1).display();
    cout << "Post-incrementing c1: ";
    (c1++).display();
    cout << "After post-incrementing c1: ";
    c1.display();

    //Test for equality
    if(c1==c2)
    cout<<"Both are equal !!"<<endl;
    else
    cout<<"Not equal"<<endl;
    return 0;
}


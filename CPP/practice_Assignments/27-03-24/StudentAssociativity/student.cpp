#include "student.h"

//DEFAULT-CTOR
Student::Student() : rno(0), strName(""), permAddress(Address()), cert(Certificate()) {}

//PARAM-CTOR
Student::Student(int i, string str) : rno(i), strName(str), permAddress(Address("401", "westside", "411061")), cert(Certificate()) {}


Student::Student(int i, string str, string flat) : rno(i), strName(str), permAddress(Address(flat, "westside", "411061")), cert(Certificate()) {}

//MEMBER-FUNCTIONS
void Student::Accept() {
    cout << "\nRNO:";
    cin >> rno;
    cout << "\nName:";
    cin >> strName;
    permAddress.Accept();
    string number, name, issuer;
    cout << "\nEnter Certificate Details:" << endl;
    cout << "\nEnter Certificate Number:" << endl;
    cin >>number;
    cout << "\nEnter Certificate Name:" << endl;
    cin >>name;
    cout << "\nEnter Issued By:" << endl;
    cin >>issuer;
    cert.SetCertificateDetails(number,name,issuer);
}

void Student::Display() {
    cout << "\nRNO=" << rno << "\nName=" << strName;
    permAddress.Display();
    cert.Display();
}


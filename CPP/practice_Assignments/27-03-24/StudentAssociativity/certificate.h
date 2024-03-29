#ifndef CERTIFICATE_H
#define CERTIFICATE_H

#include <iostream>
#include <string>
using namespace std;

class Certificate {
private:
    string certificateNumber;
    string certificateName;
    string issuedBy;

public:
    Certificate();
    Certificate(string number, string name, string issuer);
    void SetCertificateDetails(string number, string name, string issuer);
    void Display();
};

#endif


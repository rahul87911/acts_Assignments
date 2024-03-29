#include "certificate.h"

//default-CTOR
Certificate::Certificate() : certificateNumber(""), certificateName(""), issuedBy("") {}

//PARAM-CTOR
Certificate::Certificate(string number, string name, string issuer)
    : certificateNumber(number), certificateName(name), issuedBy(issuer) {}

void Certificate::SetCertificateDetails(string number, string name, string issuer) {
    certificateNumber = number;
    certificateName = name;
    issuedBy = issuer;
}

void Certificate::Display() {
    cout << "\nCertificate Number: " << certificateNumber;
    cout << "\nCertificate Name: " << certificateName;
    cout << "\nIssued By: " << issuedBy;
}


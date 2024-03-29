#ifndef STUDENT_H
#define STUDENT_H

#include <iostream>
#include <string>
#include "address.h"
#include "certificate.h"
using namespace std;

class Student {
private:
    int rno;
    string strName;
    Address permAddress;
    Certificate cert;

public:
    Student();
    Student(int i, string str);
    Student(int i, string str, string flat);
    void Accept();
    void Display() ;
};

#endif


#ifndef PLAYER_H
#define PLAYER_H

#include <string>
#include <iostream>
using namespace std;

class Player {
private:
    string name;
    int age;

public:
    Player();
    void Accept();
    void Display();
};

#endif


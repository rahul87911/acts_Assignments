#include "player.h"

Player::Player() {
    cout << "\n Player::Player()" << endl;
}

void Player::Accept() {
    cout << "\n Enter Name:";
    cin >> name;
    cout << "\n Enter Age:";
    cin >> age;
}

void Player::Display() {
    cout << "\n Name:" << name;
    cout << "\n Age:" << age;
}


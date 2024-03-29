#include "ftbplayer.h"

FTBPlayer::FTBPlayer() : goals(0) {
    cout << "\n FTBPlayer::FTBPlayer()" << endl;
}

void FTBPlayer::Accept() {
    Player::Accept();
    cout << "\n Enter Goals:";
    cin >> goals;
}

void FTBPlayer::Display() {
    Player::Display();
    cout << "\nGoals:" << goals;
}


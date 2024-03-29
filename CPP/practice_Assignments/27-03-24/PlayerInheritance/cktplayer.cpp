#include "cktplayer.h"

CKTPlayer::CKTPlayer() : runs(0) {
    cout << "\n CKTPlayer::CKTPlayer()" << endl;
}

void CKTPlayer::Accept() {
    Player::Accept();
    cout << "\n Enter Runs:";
    cin >> runs;
}

void CKTPlayer::Display() {
    Player::Display();
    cout << "\nRuns:" << runs;
}


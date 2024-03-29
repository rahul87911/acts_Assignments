#include "cktplayer.h"
#include "ftbplayer.h"

int main() {
    Player *playerPtr = nullptr;

    // CKTPlayer
    CKTPlayer cktPlayer;
    cout << "\nCKTPlayer:";
    cktPlayer.Accept();
    cktPlayer.Display();

    // FTBPlayer
    FTBPlayer ftbPlayer;
    cout << "\nFTBPlayer:";
    ftbPlayer.Accept();
    ftbPlayer.Display();

    // Using pointers
    playerPtr = &cktPlayer;
    cout << "\nUsing pointer to CKTPlayer:";
    playerPtr->Accept();
    playerPtr->Display();

    playerPtr = &ftbPlayer;
    cout << "\nUsing pointer to FTBPlayer:";
    playerPtr->Accept();
    playerPtr->Display();

    return 0;
}


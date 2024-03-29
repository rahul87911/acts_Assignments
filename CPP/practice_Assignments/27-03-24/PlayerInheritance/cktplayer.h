#ifndef CKTPLAYER_H
#define CKTPLAYER_H

#include "player.h"

class CKTPlayer : public Player {
private:
    int runs;

public:
    CKTPlayer();
    void Accept() ;
    void Display() ;
};

#endif


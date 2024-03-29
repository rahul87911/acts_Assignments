#ifndef FTBPLAYER_H
#define FTBPLAYER_H

#include "player.h"

class FTBPlayer : public Player {
private:
    int goals;

public:
    FTBPlayer();
    void Accept() ;
    void Display() ;
};

#endif


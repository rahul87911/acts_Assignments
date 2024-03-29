#include "address.h"

//default-CTOR
Address::Address() : FlatNo(""), Area(""), Pin("") {}

//PARAM-CTOR
Address::Address(string a, string b, string c) : FlatNo(a), Area(b), Pin(c) {}

//MEMBER-FUNCTIONS
void Address::Accept() {
    cout << "\nEnter Flat NO:" << endl;
    cin >> FlatNo;
    cout << "\nEnter Area:" << endl;
    cin.get();
    getline(cin, Area);
    cout << "\nEnter Pin:" << endl;
    cin >> Pin;
}

void Address::Display() {
    cout << "\nFlat NO:" << FlatNo;
    cout << "\nArea:" << Area;
    cout << "\nPIN NO:" << Pin;
}


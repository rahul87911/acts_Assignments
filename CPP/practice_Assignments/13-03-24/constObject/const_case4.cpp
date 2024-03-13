#include<iostream>
using namespace std;

class Out{

public :
        void nonConstfun()
        {cout<<"Non-Const Function called..."<<endl;
        }
        
        };
        
        int main()
        {
           Out o1;
           
           o1.nonConstfun();// successfully run
           
           return 0;
        }

#include<iostream>
using namespace std;

class Out{

public :
        void constfun() const
        {cout<<"Const Function called..."<<endl;
        }
        
        };
        
        int main()
        {
           const Out o1;
           
           o1.constfun();// successfully run
           
           return 0;
        }

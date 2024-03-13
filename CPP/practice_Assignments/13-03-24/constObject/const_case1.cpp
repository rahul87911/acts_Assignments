#include<iostream>
using namespace std;

class Out{

public :
        void non_const()
        {cout<<"Non-Const Function called..."<<endl;
        }
        
        };
        
        int main()
        {
           const Out o1;
           
           o1.non_const(); //throw error
           
           return 0;
        }

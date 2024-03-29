#include<iostream>
using namespace std;

int main()
{
    int n, x=2,i;
    cout<<"Enter a number:"<<endl;
    cin>>n;
     cout<<"First "<<n<<" Prime numbers are: ";
    while(n)
    {
        for(i=2;i<x;i++)
          
            if(x%i==0)
            
                break;
            

            if(i==x)
            {
                cout<<x<<" ";
                n--;
            }
            x++;
        
    }


    return 0;
}

#include<iostream>
using namespace std;

void printPrime(int n) {

int i=0; //initializer for first while
int num=2; //start checking from 2

while(i<n)
{
 int divisor=2;
 int is_prime=1;  //it will check whether num is prime
 
 
 while(divisor*divisor<=num)       
 {
      if(num%d==0){           //it will say it has more than 2 factors
      is_prime=0;               
      break;
      }
      ++divisor;
      }
      
      if(is_prime){         
      cout<<num<<" ";
      ++i;
      }
      ++num;
      }
     }


     
     int main(){
     int n;
     cout<<"Enter the number:"<<endl;
     cin>>n;
     cout<<"First "<<n<<" prime numbers are: ";
     printPrime(n);
     cout<<endl;
     return 0;
     }

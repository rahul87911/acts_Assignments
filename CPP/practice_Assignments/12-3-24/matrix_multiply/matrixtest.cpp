#include<iostream>
#include"matrix.h"
using namespace std;

int main()
{int arr[3][3];
int arr1[3][3];
int arr2[3][3];
int i;

do
{cout<<endl<<"Welcome!! This is 3 X 3 Matrix Multiplier:"<<endl<<"Enter 1 : Input Matrix"<<endl<<"Enter 2 : Exit"<<endl;
 cin>>i;
      if(i==1)
      {   
inputarr(arr, arr1);

productarr(arr, arr1, arr2);

displayarr(arr,  arr1, arr2);
}else if (i==2)
{cout<<"Thank You !! Have a nice day..."<<endl;}
else
continue;
} 
while(i!=2);
return 0;
}

#include<iostream>
#include"array.h"
using namespace std;

int main()
{
 int n;
 cout<<"Enter the size of Array:"<<endl;
 cin>>n;
 int arr[n];
 inputarr(arr,n);
 sortarr(arr,n);
 printarr(arr,n);
 return 0;
}

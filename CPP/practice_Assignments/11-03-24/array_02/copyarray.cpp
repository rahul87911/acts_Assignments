#include<iostream>
#include"array.h"
using namespace std;

int main()
{
	int n;
	cout<<"Enter the size of the Array which you want to copy:"<<endl;
        cin>>n;
	int arr[n],arr1[n];
        inputarr(arr,n);
        copyarr(arr,arr1,n);
        printarr(arr,arr1,n);	

	return 0;
}

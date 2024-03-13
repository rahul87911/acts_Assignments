#include"array.h"
#include<iostream>
using namespace std;

void inputarr(int *arr, int n)
{cout<<"Enter the elements of the array:"<<endl;

 for(int i=0; i<n; i++)
 {cin>>arr[i];}
}


void printarr(int* arr, int n)
{
	cout<<"Sorted array elements are in Ascending Order are:"<<endl;

	for(int i=0; i<n; i++)
	{
	   cout<<"["<<arr[i]<<"]";
	}
}


void sortarr(int* arr, int n)
{
int c;

for(int i=0;i<n;i++)  //for ascending order
{
	for(int j=i;j<n;j++)
	{
		if(arr[i]>arr[j+1])
		{
			c=arr[i];
			arr[i]=arr[j+1];
			arr[j+1]=c;
		}
	}
}
}

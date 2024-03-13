#include"array.h"
#include<iostream>
using namespace std;

void inputarr(int* arr, int n)
{
	cout<<"Enter the elements of First Array:"<<endl;
	for(int i=0; i<n; i++)
	{cin>>arr[i];}
}

void printarr(int* arr,int* arr1, int n)
{
	cout<<"Elements of First Array are:"<<endl;
	for(int i=0; i<n; i++)
	{cout<<"["<<arr[i]<<"]";}
	cout<<endl;

	cout<<"Elements of Copied Array are:"<<endl;
	for(int i=0; i<n;i++)
	{cout<<"["<<arr1[i]<<"]";}
}

void copyarr(int* arr, int* arr1, int n)
{
	for(int i=0; i<n; i++)
	{
		arr1[i]=arr[i];
	}
}


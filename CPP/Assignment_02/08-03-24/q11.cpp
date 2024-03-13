#include<iostream>
#include<string>
using namespace std;

int main()
{
	string str;
	int l,i;

	cout<<"Enter any Character:"<<endl;
	cin>>str;

	l=str.length();

	for(i=0; i<l; i++)
	{
	if(str[i]>='a' && str[i]<='z')
	{
	str[i] = str[i]-32;
	}
	else if(str[i]>='A'&& str[i]<='Z')
	{
	str[i]=str[i]+32;
	}
	}

	cout<<str;
	return 0;
}


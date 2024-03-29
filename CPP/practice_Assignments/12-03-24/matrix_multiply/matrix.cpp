#include<iostream>
#include"matrix.h"
using namespace std;

void inputarr(int arr[][3], int arr1[][3])
{int j,k;
	
	
	 cout<<"Enter the elements of First Matrix:"<<endl;
		 for(j=0;j<3;j++)
		 { for(k=0;k<3;k++)
			 { cin>>arr[j][k];
			 }
		 }

	  cout<<"Enter the elements of Second Matrix:"<<endl;
	         for(j=0;j<3;j++)
		 { for(k=0;k<3;k++)
			 { cin>>arr1[j][k];
			 }
		 }
           
}


void displayarr(int arr[][3], int arr1[][3], int arr2[][3])
{int j,k;

	cout<<"First Matrix:"<<endl;

	for(j=0;j<3;j++)
	{cout<<endl;
		for(k=0;k<3;k++)
		{cout<< arr[j][k] <<" "; 
		}

	}
         
	cout<<endl<<"Second Matrix:"<<endl;

	for(j=0;j<3;j++)
	{cout<<endl;
		for(k=0;k<3;k++)
		{cout<< arr1[j][k] <<" ";
		}
	}

	cout<<endl<<"Product Matrix:"<<endl;

	for(j=0;j<3;j++)
	{cout<<endl;
		for(k=0;k<3;k++)
		{cout<< arr2[j][k] <<" ";
		}
	}
}


void productarr(int arr[][3], int arr1[][3], int arr2[][3])
{ for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            int sum = 0;
            for (int k = 0; k < 3; ++k) {
                sum += arr[i][k] * arr1[k][j];
            }
            arr2[i][j] = sum;
        }
    }
}




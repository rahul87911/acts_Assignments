#include "util.h"
void sortEmpSalary(Employee arr[], int length)
{
	for(int i=0 ; i < length; i++)
	{
		for(int j = i+1 ; j < length; j++)
		{
		if(arr[i].getSalary() > arr[j].getSalary()) {
		Employee temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
	}
}

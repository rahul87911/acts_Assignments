#include<stdio.h>


int sum(int n)
{
int d, sum=0;

while(n!=0)
{
d=n%10;
sum=sum+d;
n=n/10;
}

return sum;


}


int main()
{
int n;
int sum1;
printf("Enter the number\n");
scanf("%d",&n);

sum1= sum(n);

printf("Sum of digits is %d" ,sum1);

return 0;
}

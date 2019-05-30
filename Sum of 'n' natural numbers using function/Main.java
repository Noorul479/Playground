#include<stdio.h>
int sum_of_nat_num(int num);
int main() 
{
  int n;
  scanf("%d",&n);
  printf("%d",sum_of_nat_num(n));
  return 0;
}
int sum_of_nat_num(int num)
{
 int sum=0,i;
  for(i=0;i<=num;i++)
  {
    sum=sum+i;
  }// Type your code here
  	return sum;
}
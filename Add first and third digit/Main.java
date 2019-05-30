#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int first=a/100;
  int second=(a%100)%10;
  int sum=first+second;
  printf("%d",sum);
  
  //Type your code here
  return 0;
}
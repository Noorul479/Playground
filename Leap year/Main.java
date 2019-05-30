#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  b=a%4;
  if(b==0)
    printf("Leap year");
  else
    printf("Not Leap year");
  //Type your code here
  return 0;
}
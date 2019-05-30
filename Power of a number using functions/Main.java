#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
 int c = power(a,b);
  printf("%d",c);
  return 0;
}
int power(int x,int y)
{
 int k = pow(x,y);
  return k;
}
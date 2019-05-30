#include <stdio.h>
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  greatest(a,b,c);
  return 0;
}
int greatest(int a,int b,int c)
{
  int temp;
  if(a>b)
  {
    temp = a;
    if(a>c)
    {
      temp=a;
    }
    else
    {
      temp = c;
    }
  }
  else
  {
     temp = b;
    if(b>c)
    {
      temp=b;
    }
    else
    {
      temp=c;
    }
   }
   printf("%d",temp);
 }
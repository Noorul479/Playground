#include <stdio.h>
int main() 
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  gcd(a,b,c);
  return 0;
}
int gcd (int a,int b,int c)
{
  int min,gcd,temp,min2,gcd2;
  if(a<b)
  {
    min=a;
  }
  else
  {
    min=b;
  }
  while(min>=1)
  {
    if((a%min==0)&&(b%min==0))
    {
      gcd=min;
      break;
    }
    min--;
  }
  temp= gcd;

  if(temp<c)
  {
    min2=temp;
  }
  else
  {
    min2=c;
  }
  while(min2>=1)
  {
    if((temp%min2==0)&&(c%min2==0))
    {
      gcd2=min2;
      break;
    }
    min--;
  }
printf("%d",gcd2);
}

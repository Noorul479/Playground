#include <stdio.h>
int main() 
{
  int n;
  int last,ft,sum;
  if(n>=10)
  {
    last=n%10;
    ft=n/10;
  
    while(ft>=10)
    {
      ft=ft/10;
    }
  }
  sum=ft+last;
	printf("%d",sum);//Type your code
	return 0;
}
#include <stdio.h>
int main() 
{
  int a,i,n=3;
  scanf("%d",&a);
  for(i=1;i<=a;i++)
  {
    printf("%d",i);
    if((i%n==0)&&(i!=a))
    {
      printf(",");
    }
    
  }
  
  
	//Type your code
	return 0;
}
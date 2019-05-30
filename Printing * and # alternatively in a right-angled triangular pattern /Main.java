#include <stdio.h>
int main()
{
  int a;
  int num=0;
  scanf("%d",&a);
  for(int cur_row=1;cur_row<=a;cur_row++)
  {
    for(int cur_col=1;cur_col<=cur_row;cur_col++)
    {
      num=num+1;
      if(num%2==0)
      {
        printf("#");
      }
      else
      {
        printf("*");
      }
    }
    printf("\n");
  }
	// Type your code here
  	return 0;
}
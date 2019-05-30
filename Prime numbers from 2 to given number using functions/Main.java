#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=prime(a);
 }
int prime (int x)
{
  for(int i=2;i<=x;i++)
  {
    int c=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
         
       if(c==2)
        {
            printf("%d \n",i);
        }
    }
}
#include <stdio.h>
int main() 
{
  int i, j, rows;
 
    scanf("%d", &rows);
   for(i=1; i<=rows; i++)
    { 
      for(j=i; j<rows; j++)
        {
            printf(" ");
        }

     
        for(j=1; j<=(2*i-1); j++)
        {
            printf("*");
        }

       
        printf("\n");
    }

	// Type your code here
	return 0;
}